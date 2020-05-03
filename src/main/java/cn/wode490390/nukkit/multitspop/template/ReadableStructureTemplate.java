package cn.wode490390.nukkit.multitspop.template;

import cn.nukkit.level.ChunkManager;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.math.BlockVector3;
import cn.nukkit.math.NukkitRandom;
import cn.nukkit.nbt.tag.CompoundTag;

public interface ReadableStructureTemplate extends StructureTemplate {

    ReadableStructureTemplate load(CompoundTag root);

    boolean placeInChunk(FullChunk chunk, NukkitRandom random, BlockVector3 position, StructurePlaceSettings settings);

    boolean placeInLevel(ChunkManager level, NukkitRandom random, BlockVector3 position, StructurePlaceSettings settings);
}
