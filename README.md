> **Language:** Русский · [English](README.en.md)

# Exline's Copper Equipment (Minecraft 1.21.4 Fabric Port)

![Java 21](https://img.shields.io/badge/Java-21-blue.svg)
![Minecraft](https://img.shields.io/badge/Minecraft-1.21.4-blue.svg)
![Fabric](https://img.shields.io/badge/Loader-Fabric-blue.svg)
![ModMenu](https://img.shields.io/badge/ModMenu-Supported-blue.svg)
![License](https://img.shields.io/badge/License-MIT-blue.svg)

Порт и оптимизация мода **Exline's Copper Equipment** для **Minecraft 1.21.4 (Fabric)**.

Оригинальный разработчик: [exline](https://modrinth.com/mod/exlines-copper-equipment).

---

## О моде

**Exline's Copper Equipment** добавляет полноценный комплект инструментов, оружия и брони из меди, заполняя промежуток между кожей/камнем и железом.

---

## Галерея

| Медная экипировка | Рецепты крафта | Окисление предметов |
|:---:|:---:|:---:|
| ![Медная экипировка](images/copper_equipment_showcase.png) | ![Рецепты крафта](images/copper_tool_recipes.gif) | ![Окисление предметов](images/copper_oxidation.png) |

---

## Возможности

- **Полный комплект медной брони**: медный шлем, нагрудник, поножи и ботинки.
- **Медный арсенал и инструменты**: медный меч, кирка, топор, лопата и мотыга.
- **Медное ведро и ножницы**: полезные медные инструменты для повседневного выживания.
- **Сбалансированные характеристики**: показатели прочности и урона логично сбалансированы между каменной и железной экипировкой.
- **Поддержка зачарований**: предметы можно улучшать на наковальне и зачаровывать на столе зачарований.

---

## Что изменено в порте для 1.21.4 (byMr712)

- Полная миграция на **Minecraft 1.21.4** (Fabric Loader, Yarn mappings, Java 21 LTS).
- **Исправлен спам в логах**: полностью удалён отладочный вывод (`tickCount: ..., bound: ...`), который забивал консоль и лог-файлы каждый тик при надетой медной броне.
- Обновлены регистрация предметов, компонентов брони и система рецептов под актуальный API 1.21.4.
- Настроена оптимизированная сборка мода.

---

## Установка

1. Скачайте последнюю версию со страницы [GitHub Releases](https://github.com/byMr712/ExlineCoppeRequipment-1.21.4-MinecraftMod/releases).
2. Требуются:
   - [Fabric API](https://modrinth.com/mod/fabric-api)
3. Поместите `.jar` файл в папку `mods`.
4. Запустите игру.

---

## Сборка

1. Требуется Java 21 и Fabric Loader для Minecraft 1.21.4.
2. Для сборки выполните:
   ```bash
   ./gradlew build
   ```
3. Собранный файл находится в `build/libs/ExlineCoppeRequipment-1.21.4-byMr712.jar`.

---

## Авторы и лицензия

- Оригинальный автор: [exline](https://modrinth.com/mod/exlines-copper-equipment).
- Порт и оптимизация для 1.21.4: [Mr712](https://github.com/byMr712).
- Распространяется под лицензией [MIT License](LICENSE).