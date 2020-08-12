package com.legopitstop.morefood.foods.LikeDriedKelp;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class WarpedBerries extends Item {

    public WarpedBerries() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.3f)
                .setAlwaysEdible()
                .fastToEat()

                .effect(new EffectInstance(Effects.BLINDNESS, 30*20, 0), 1.0F)
                .build())

        );

    }
}
