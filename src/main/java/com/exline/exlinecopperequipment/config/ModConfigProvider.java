/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package com.exline.exlinecopperequipment.config;

import com.exline.exlinecopperequipment.config.SimpleConfig;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class ModConfigProvider
implements SimpleConfig.DefaultConfig {
    private String configContents = "";
    private final List<Pair> configsList = new ArrayList<Pair>();

    public List<Pair> getConfigsList() {
        return this.configsList;
    }

    public void addKeyValuePair(Pair<String, ?> keyValuePair, String comment) {
        this.configsList.add(keyValuePair);
        this.configContents = this.configContents + (String)keyValuePair.getFirst() + "=" + String.valueOf(keyValuePair.getSecond()) + " #" + comment + " | default: " + String.valueOf(keyValuePair.getSecond()) + "\n";
    }

    @Override
    public String get(String namespace) {
        return this.configContents;
    }
}

