package com.peasenet.mod;

import com.peasenet.main.GavinsMod;
import com.peasenet.mods.movement.ModAntiTrample;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AntiTrampleMod implements ModInitializer {

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GavinsMod.addMod(new ModAntiTrample());
    }
}
