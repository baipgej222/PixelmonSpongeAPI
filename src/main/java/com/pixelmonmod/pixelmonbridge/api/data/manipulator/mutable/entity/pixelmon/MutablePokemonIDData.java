package com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon.ImmutablePokemonIDData;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.value.mutable.ListValue;
import org.spongepowered.api.entity.living.player.Player;

public interface MutablePokemonIDData extends DataManipulator<MutablePokemonIDData, ImmutablePokemonIDData> {

    ListValue<Integer> pokemonID();
    void setAsPlayerPokemon(Player player);

}
