pluslatte's fork of GregTech-6

# 概要
## 説明
以下の気になる点の解消を目的としたGregTech-6のfork。
- ThaumCraft4との同時プレイ時、small鉱石の仕様上序盤の結晶片の供給がつらい
- 繰り返しプレイしている場合、最序盤の進行がだるく感じる
- 序盤は建材が不足しがちで、拠点の構築が困難

## 機能追加
- 初動を楽にするため、初期スポーンエリアに確実にGreg要塞を生成する。
  - 鍛冶場から金属材料や優秀なツールを確保。
  - 資材庫から結晶片や金属材料などを確保。
  - 植物エリアから各種苗木や食料、サトウキビ等を確保。
  - 完成品のトラップタワーからboomstickの材料を確保。
- 上記機能のconfigからのオン・オフ。

## 修正
- 海の水の下が不自然に暗くなっているのを修正。

以下初期readme。

This is the Git Repository for GregTech-6

# License

This Mod is licensed under the [GNU Lesser General Public License](LICENSE).
All assets, unless otherwise stated, are dedicated to the public domain
according to the [CC0 1.0 Universal Public Domain Dedication](src/main/resources/LICENSE.assets).
Any assets containing the [GregTech logo](src/main/resources/logos) or any
derivative of it are licensed under the
[Creative Commons Attribution-NonCommercial 4.0 International Public License](src/main/resources/LICENSE.logos).

# Support

You can use the Issue Tracker, or you can just use the [Forums](https://forum.mechaenetia.com/). Both ways will notify Greg at the very same time.

# Dev Environment Setup

Once you have this project cloned then forge needs to be set up.  There are 2 options:

* If you want to just compile GT6 as quick as possible, then start by running `./gradlew setupCIWorkspace`.  This tasks just builds enough of Minecraft and Forge to be able to build Forge Mods, but not to do any development.
* If you want to compile GT6 and want the full decompiled and deobfuscated source code in the development environment and want to be able to run MC from within the development environment then run `./gradlew setupDevWorkspace setupDecompWorkspace`.

Once you have set up your environment then you can run the `assemble` task to build GT6 like:  `./gradlew assemble`

If you want to run the client then you can run the `runClient` task:  `./gradlew runClient`

Ditto with `runServer` for a server run.

To edit the code in an IDE just open the gradle project in IntelliJ or other decent IDE.  Use the `assemble` gradle task to build or `runClient` or `runServer` tasks to be able to actively debug the running the game.

On the commandline you can combine classes altogether, for example, to just build GT6 you can do this after a fresh clone:
```sh
./gradlew setupCIWorkspace assemble
```
And the file will be in `build/libs` as usual.

Can fully get a full dev environment, build, and run the client all at once from a fresh clone with:
```sh
./gradlew setupDevWorkspace setupDecompWorkspace assemble runClient
```

