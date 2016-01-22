package com.pixelmonmod.pixelmonbridge.api.utils;

import org.spongepowered.api.entity.EntitySnapshot;
import org.spongepowered.api.entity.living.player.Player;

public interface ComputerHelper {

    void addToComputer(Player player, EntitySnapshot snapshot);

}
