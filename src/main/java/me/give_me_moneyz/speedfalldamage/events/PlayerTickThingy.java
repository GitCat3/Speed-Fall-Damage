package me.give_me_moneyz.speedfalldamage.events;

import me.give_me_moneyz.speedfalldamage.SpeedFallDamage;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpeedFallDamage.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerTickThingy {
    @SubscribeEvent
    public static void PlayerTickEvent(final TickEvent.PlayerTickEvent event) {
        var speed = (event.player.getY() - event.player.yOld) * 20;
        if(speed != 0.0) {
            event.player.sendSystemMessage(Component.translatable(String.valueOf(speed)));
        }
    }

}
