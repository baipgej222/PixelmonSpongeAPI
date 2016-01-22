package com.pixelmonmod.pixelmonbridge.api.utils;

import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.player.Player;

import java.util.Optional;

public interface PokemonHelper {

    Optional<Living> makeAndSetupPokemon(Player player, String pokemonName);

}
