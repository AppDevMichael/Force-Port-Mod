


package me.duncanruns.forceport.mixin;

import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PlayerManager.class)
public abstract class PlayerManagerMixin {
    /**
     * @author AppDevMichael
     * @reason Replace the default 8 player limit with 20
     */
    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"))
    public static int changeMaxPlayers(int maxPlayers) {
        if (maxPlayers == 8) { return 20; }
        return maxPlayers;
    }
}
