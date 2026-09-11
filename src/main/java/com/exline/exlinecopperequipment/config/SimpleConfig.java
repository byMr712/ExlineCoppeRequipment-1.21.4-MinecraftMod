/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.exline.exlinecopperequipment.config;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Scanner;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleConfig {
    private static final Logger LOGGER = LogManager.getLogger((String)"SimpleConfig");
    private final HashMap<String, String> config = new HashMap();
    private final ConfigRequest request;
    private boolean broken = false;

    public static ConfigRequest of(String filename) {
        Path path = FabricLoader.getInstance().getConfigDir();
        return new ConfigRequest(path.resolve(filename + ".properties").toFile(), filename);
    }

    private void createConfig() throws IOException {
        this.request.file.getParentFile().mkdirs();
        Files.createFile(this.request.file.toPath(), new FileAttribute[0]);
        PrintWriter writer = new PrintWriter(this.request.file, "UTF-8");
        writer.write(this.request.getConfig());
        writer.close();
    }

    private void loadConfig() throws IOException {
        Scanner reader = new Scanner(this.request.file);
        int line = 1;
        while (reader.hasNextLine()) {
            this.parseConfigEntry(reader.nextLine(), line);
            ++line;
        }
    }

    private void parseConfigEntry(String entry, int line) {
        if (!entry.isEmpty() && !entry.startsWith("#")) {
            String[] parts = entry.split("=", 2);
            if (parts.length == 2) {
                String temp = parts[1].split(" #")[0];
                this.config.put(parts[0], temp);
            } else {
                throw new RuntimeException("Syntax error in config file on line " + line + "!");
            }
        }
    }

    private SimpleConfig(ConfigRequest request) {
        this.request = request;
        String identifier = "Config '" + request.filename + "'";
        if (!request.file.exists()) {
            LOGGER.info(identifier + " is missing, generating default one...");
            try {
                this.createConfig();
            }
            catch (IOException e) {
                LOGGER.error(identifier + " failed to generate!");
                LOGGER.trace((Object)e);
                this.broken = true;
            }
        }
        if (!this.broken) {
            try {
                this.loadConfig();
            }
            catch (Exception e) {
                LOGGER.error(identifier + " failed to load!");
                LOGGER.trace((Object)e);
                this.broken = true;
            }
        }
    }

    @Deprecated
    public String get(String key) {
        return this.config.get(key);
    }

    public String getOrDefault(String key, String def) {
        String val = this.get(key);
        return val == null ? def : val;
    }

    public int getOrDefault(String key, int def) {
        try {
            return Integer.parseInt(this.get(key));
        }
        catch (Exception e) {
            return def;
        }
    }

    public boolean getOrDefault(String key, boolean def) {
        String val = this.get(key);
        if (val != null) {
            return val.equalsIgnoreCase("true");
        }
        return def;
    }

    public double getOrDefault(String key, double def) {
        try {
            return Double.parseDouble(this.get(key));
        }
        catch (Exception e) {
            return def;
        }
    }

    public boolean isBroken() {
        return this.broken;
    }

    public boolean delete() {
        LOGGER.warn("Config '" + this.request.filename + "' was removed from existence! Restart the game to regenerate it.");
        return this.request.file.delete();
    }

    public static class ConfigRequest {
        private final File file;
        private final String filename;
        private DefaultConfig provider;

        private ConfigRequest(File file, String filename) {
            this.file = file;
            this.filename = filename;
            this.provider = DefaultConfig::empty;
        }

        public ConfigRequest provider(DefaultConfig provider) {
            this.provider = provider;
            return this;
        }

        public SimpleConfig request() {
            return new SimpleConfig(this);
        }

        private String getConfig() {
            return this.provider.get(this.filename) + "\n";
        }
    }

    public static interface DefaultConfig {
        public String get(String var1);

        public static String empty(String namespace) {
            return "";
        }
    }
}

