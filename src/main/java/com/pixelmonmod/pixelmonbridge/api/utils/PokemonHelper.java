package com.pixelmonmod.pixelmonbridge.api.utils;

import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.player.Player;

import java.util.Optional;

public interface PokemonHelper {

    /**
     * Sets up a pokemon to be owned by a player
     * @param player the player to generate the pokemon ids from
     * @param pokemonName the name of the pokemon to create
     * @return pokemon with ids + movesets setup
     */
    Optional<Living> makeAndSetupPokemon(Player player, String pokemonName);

    /**
     * Adds a random moveset to the pokemon
     * @param pixelmon to apply moves to
     * @return pixelmon with random moves applied
     */
    Optional<Living> giveRandomMoveset(Living pixelmon);

}
