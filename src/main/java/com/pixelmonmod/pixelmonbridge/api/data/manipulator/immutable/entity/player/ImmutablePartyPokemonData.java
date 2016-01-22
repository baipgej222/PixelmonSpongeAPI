package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.player;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.player.MutablePartyPokemonData;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.immutable.ImmutableMapValue;
import org.spongepowered.api.entity.EntitySnapshot;

public interface ImmutablePartyPokemonData extends ImmutableDataManipulator<ImmutablePartyPokemonData, MutablePartyPokemonData> {

    ImmutableMapValue<Integer, EntitySnapshot> partyPokemon();

}
