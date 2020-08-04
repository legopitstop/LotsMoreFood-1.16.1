package com.legopitstop.morefood.init;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.blocks.CompressedBlock;
import com.legopitstop.morefood.blocks.MfCakeBlock;
import com.legopitstop.morefood.blocks.StoveBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MorefoodBlocks {

    // Register items & blocks
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreFood.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> APPLE_BLOCK = BLOCKS.register("apple_block", CompressedBlock::new);
    public static final RegistryObject<Block> BAKED_POTATO_BLOCK = BLOCKS.register("baked_potato_block", CompressedBlock::new);
    public static final RegistryObject<Block> BANANA_BLOCK = BLOCKS.register("banana_block", CompressedBlock::new);
    public static final RegistryObject<Block> CARROT_BLOCK = BLOCKS.register("carrot_block", CompressedBlock::new);
    public static final RegistryObject<Block> COOKED_BEEF_BLOCK = BLOCKS.register("cooked_beef_block", CompressedBlock::new);
    public static final RegistryObject<Block> COOKED_CHICKEN_BLOCK = BLOCKS.register("cooked_chicken_block", CompressedBlock::new);
    public static final RegistryObject<Block> COOKED_MUTTON_BLOCK = BLOCKS.register("cooked_mutton_block", CompressedBlock::new);
    public static final RegistryObject<Block> COOKED_RABBIT_BLOCK = BLOCKS.register("cooked_rabbit_block", CompressedBlock::new);
    public static final RegistryObject<Block> COOKED_SQUID_BLOCK = BLOCKS.register("cooked_squid_block", CompressedBlock::new);
    public static final RegistryObject<Block> COOKIE_BLOCK = BLOCKS.register("cookie_block", CompressedBlock::new);
    public static final RegistryObject<Block> DARK_CHOCOLATE_BLOCK = BLOCKS.register("dark_chocolate_block", CompressedBlock::new);
    public static final RegistryObject<Block> GOLDEN_APPLE_BLOCK = BLOCKS.register("golden_apple_block", CompressedBlock::new);
    public static final RegistryObject<Block> GRAPE_BLOCK = BLOCKS.register("grape_block", CompressedBlock::new);
    public static final RegistryObject<Block> HOPS_BLOCK = BLOCKS.register("hops_block", CompressedBlock::new);
    public static final RegistryObject<Block> LEMON_BLOCK = BLOCKS.register("lemon_block", CompressedBlock::new);
    public static final RegistryObject<Block> MILK_CHOCOLATE_BLOCK = BLOCKS.register("milk_chocolate_block", CompressedBlock::new);
    public static final RegistryObject<Block> OLIVE_BLOCK = BLOCKS.register("olive_block", CompressedBlock::new);
    public static final RegistryObject<Block> ORANGE_BLOCK = BLOCKS.register("orange_block", CompressedBlock::new);
    public static final RegistryObject<Block> PLUM_BLOCK = BLOCKS.register("plum_block", CompressedBlock::new);
    public static final RegistryObject<Block> POTATO_BLOCK = BLOCKS.register("potato_block", CompressedBlock::new);
    public static final RegistryObject<Block> RASPBERRY_BLOCK = BLOCKS.register("raspberry_block", CompressedBlock::new);
    public static final RegistryObject<Block> RAW_BEEF_BLOCK = BLOCKS.register("raw_beef_block", CompressedBlock::new);
    public static final RegistryObject<Block> RAW_CHICKEN_BLOCK = BLOCKS.register("raw_chicken_block", CompressedBlock::new);
    public static final RegistryObject<Block> RAW_MUTTON_BLOCK = BLOCKS.register("raw_mutton_block", CompressedBlock::new);
    public static final RegistryObject<Block> RAW_RABBIT_BLOCK = BLOCKS.register("raw_rabbit_block", CompressedBlock::new);
    public static final RegistryObject<Block> RAW_SQUID_BLOCK = BLOCKS.register("raw_squid_block", CompressedBlock::new);
    public static final RegistryObject<Block> STRAWBERRY_BLOCK = BLOCKS.register("strawberry_block", CompressedBlock::new);
    public static final RegistryObject<Block> TOMATO_BLOCK = BLOCKS.register("tomato_block", CompressedBlock::new);
    public static final RegistryObject<Block> WHITE_CHOCOLATE_BLOCK = BLOCKS.register("white_chocolate_block", CompressedBlock::new);

    public static final RegistryObject<Block> STOVE = BLOCKS.register("stove", StoveBlock::new);

    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake", MfCakeBlock::new);
    public static final RegistryObject<Block> RAINBOW_CAKE = BLOCKS.register("rainbow_cake", MfCakeBlock::new);
    public static final RegistryObject<Block> REDWHITEBLUE_CAKE = BLOCKS.register("redwhiteblue_cake", MfCakeBlock::new);
}
