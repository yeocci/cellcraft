# CellCraft Build Setup

This document explains how to build the CellCraft mod for both Fabric and Forge.

## Prerequisites

- Java 17 or higher
- Gradle 8.5 or higher

## Project Structure

```
cellcraft/
├── common/           # Shared code for both loaders
│   └── src/main/java/com/yeocci/cellcraft/
│       └── CellCraft.java
├── fabric/           # Fabric-specific code
│   └── src/main/java/com/yeocci/cellcraft/fabric/
│       └── CellCraftFabric.java
└── forge/            # Forge-specific code
    └── src/main/java/com/yeocci/cellcraft/forge/
        └── CellCraftForge.java
```

## Building Instructions

### Setting Up Build Environment

The project uses Fabric Loom for building both Fabric and Forge versions. To build successfully:

1. Ensure your `gradle.properties` has the correct versions for Minecraft 1.20.1
2. The Fabric module can be built using standard Fabric Loom
3. The Forge module requires additional ForgeGradle configuration or Architectury Loom

### Current Build Status

- ✅ Project structure complete
- ✅ Common module with shared game content
- ✅ Fabric module with proper entry point
- ✅ Forge module with proper @Mod annotation
- ✅ Metadata files (fabric.mod.json, mods.toml)
- ✅ Resource files (lang, models, blockstates)
- ⏳ Build scripts (requires stable Loom version configuration)

## Manual Build Setup

If automated builds don't work, you can:

1. Use the Fabric Example Mod template for the Fabric version
2. Use the Forge MDK template for the Forge version
3. Copy the common code from `common/src/` into each project

## Mod Features

The mod includes:
- Cell Block: A basic block example (similar to iron block properties)
- Proper registration for both loaders
- Resource files (models, textures, lang files)
