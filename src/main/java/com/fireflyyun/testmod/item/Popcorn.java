package com.fireflyyun.testmod.item;

import com.fireflyyun.testmod.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Popcorn extends Item {
    public Popcorn(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        user.playSound(ModSounds.POPCORN_CRUNCH, 1.0F, 1.0F);
        return ActionResult.SUCCESS;
    }
}
