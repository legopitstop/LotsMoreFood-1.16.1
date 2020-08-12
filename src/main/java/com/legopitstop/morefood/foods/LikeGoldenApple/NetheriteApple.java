package com.legopitstop.morefood.foods.LikeGoldenApple;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class NetheriteApple extends Item {

    public NetheriteApple() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.3f)
                .setAlwaysEdible()

                .effect(new EffectInstance(Effects.INSTANT_HEALTH, 1*20, 0), 1.0F)
                .effect(new EffectInstance(Effects.RESISTANCE, 4*60*20, 0), 1.0F)
                .effect(new EffectInstance(Effects.ABSORPTION, 4*60*20, 0), 1.0F)
                .effect(new EffectInstance(Effects.HASTE, 4*60*20, 0), 1.0F)

                .build())

        );

    }
}
