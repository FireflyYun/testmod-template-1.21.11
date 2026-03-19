package com.fireflyyun.testmod.sound;

import com.fireflyyun.testmod.TestMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    // 1. 定义声音事件
    public static final SoundEvent POPCORN_CRUNCH = register("popcorn.crunch");

    // 2. 注册方法
    private static SoundEvent register(String id) {
        Identifier soundId = Identifier.of(TestMod.MOD_ID, id);

        // 1.21.2+ 版本的注册方式
        final RegistryKey<SoundEvent> registryKey = RegistryKey.of(RegistryKeys.SOUND_EVENT, soundId);

        // 创建 SoundEvent 对象并注册
        return Registry.register(Registries.SOUND_EVENT, registryKey, SoundEvent.of(soundId));
    }

    // 3. 初始化方法
    public static void initialize() {
        // 触发类加载
    }
}
