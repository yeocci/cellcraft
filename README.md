# CellCraft

A Minecraft mod for cellular automata and crafting, supporting both Forge and Fabric loaders.

## Project Structure

This is a multi-loader Minecraft mod project with separate modules for different mod loaders:

- `common/` - Shared code used by both Fabric and Forge versions
- `fabric/` - Fabric-specific implementation and configuration
- `forge/` - Forge-specific implementation and configuration

## Features

- Multi-loader architecture (Fabric & Forge)
- Example Cell Block item
- Shared common code between loaders

## Building

### Fabric

The Fabric version can be built using:

```bash
./gradlew :fabric:build
```

The compiled mod jar will be located in `fabric/build/libs/`

### Forge

The Forge version requires ForgeGradle configuration. The structure and code are in place in the `forge/` directory.

## Requirements

- Java 17 or higher
- Minecraft 1.20.1
- Gradle 8.5+

## Development Status

✅ Project structure created  
✅ Common module with shared code  
✅ Fabric module configuration  
✅ Forge module structure  
⏳ Build scripts (Fabric working, Forge needs ForgeGradle setup)

## License

MIT