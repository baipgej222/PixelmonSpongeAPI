package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon.MutablePokemonIDData;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.immutable.ImmutableListValue;

public interface ImmutablePokemonIDData extends ImmutableDataManipulator<ImmutablePokemonIDData, MutablePokemonIDData> {

    ImmutableListValue<Integer> pokemonID();

}
