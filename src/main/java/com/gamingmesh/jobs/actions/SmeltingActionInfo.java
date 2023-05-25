package com.gamingmesh.jobs.actions;

import com.gamingmesh.jobs.container.ActionType;
import net.Zrips.CMILib.Version.Version;
import org.bukkit.inventory.ItemStack;

public class SmeltingActionInfo extends MaterialActionInfo {
    private int cmd;

    public SmeltingActionInfo(ItemStack itemStack, ActionType type) {
        super(itemStack.getType(), Version.isCurrentEqualOrHigher(Version.v1_13_R1) ? 0 : itemStack.getData().getData(), type);

        if (itemStack.hasItemMeta() && itemStack.getItemMeta().hasCustomModelData()) {
            cmd = itemStack.getItemMeta().getCustomModelData();
        }
    }

    public int getCmd() {
        return cmd;
    }
}
