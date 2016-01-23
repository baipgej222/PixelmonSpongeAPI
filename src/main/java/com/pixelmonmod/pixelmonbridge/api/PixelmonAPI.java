package com.pixelmonmod.pixelmonbridge.api;

import com.google.common.base.Preconditions;
import com.pixelmonmod.pixelmonbridge.api.utils.BlockHelper;
import com.pixelmonmod.pixelmonbridge.api.utils.ComputerHelper;
import com.pixelmonmod.pixelmonbridge.api.utils.PlayerHelper;
import com.pixelmonmod.pixelmonbridge.api.utils.PokemonHelper;

public final class PixelmonAPI {

    private static final PokemonHelper pokemonHelper = null;

    public static PokemonHelper getPokemonHelper() {
        Preconditions.checkState(pokemonHelper != null, "PixelmonHelper was not initialized");
        return pokemonHelper;
    }

    private static final ComputerHelper computerHelper = null;

    public static ComputerHelper getComputerHelper() {
        Preconditions.checkState(computerHelper != null, "ComputerHelper was not initialized");
        return computerHelper;
    }

    private static final BlockHelper blockHelper = null;

    public static BlockHelper getBlockHelper() {
        Preconditions.checkState(blockHelper != null, "BlockHelper was not initialized");
        return blockHelper;
    }

    private static final PlayerHelper playerHelper = null;

    public static PlayerHelper getPlayerHelper() {
        Preconditions.checkState(playerHelper != null, "PlayerHelper was not initialized");
        return playerHelper;
    }

}
