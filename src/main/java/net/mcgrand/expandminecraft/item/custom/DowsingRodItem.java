package net.mcgrand.expandminecraft.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class DowsingRodItem extends Item {
    public DowsingRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundblock = false;
            for(int i = -500;i<=positionClicked.getY();i++){
                Block blockBellow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if(isVleuable(blockBellow)){
                    sendplayer(player, "Found " + blockBellow.asItem().getName().getString() + " at " + positionClicked.getX()+ ", " + positionClicked.getY() + ", " + positionClicked.getZ());
                    foundblock = true;
                }

            }
            if(!foundblock){
                sendplayer(player, "Did not find anything");
            }
            context.getStack().damage(1,context.getPlayer(), (pLayer) -> pLayer.sendToolBreakStatus(pLayer.getActiveHand()));
        }

        return super.useOnBlock(context);
    }

    private void sendplayer(PlayerEntity player, String messege) {
        player.sendMessage(new LiteralText(messege),false);
    }

    private boolean isVleuable(Block block){

        return block == Blocks.COAL_ORE || block == Blocks.IRON_ORE || block == Blocks.DEEPSLATE_COAL_ORE || block == Blocks.DEEPSLATE_IRON_ORE || block == Blocks.DEEPSLATE_LAPIS_ORE || block == Blocks.DEEPSLATE_COPPER_ORE || block == Blocks.DEEPSLATE_REDSTONE_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE||  block == Blocks.DIAMOND_ORE || block == Blocks.REDSTONE_ORE || block == Blocks.LAPIS_ORE || block == Blocks.GOLD_ORE || block == Blocks.COPPER_ORE;
    }
}
