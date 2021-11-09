package net.ZakiChel.tutorialmod.item.custom;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SmartCoordinatesTellerItem extends Item {

    public SmartCoordinatesTellerItem(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        BlockPos playerCoords = pPlayer.getOnPos();
        pPlayer.sendMessage(new TextComponent("Your Coordinates are : " + playerCoords),
                Util.NIL_UUID);


        return null;
    }
}

