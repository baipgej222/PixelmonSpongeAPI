package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon.MutablePokemonLevelData;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.immutable.ImmutableValue;

public interface ImmutablePokemonLevelData extends ImmutableDataManipulator<ImmutablePokemonLevelData, MutablePokemonLevelData> {

    ImmutableValue<Integer> level();

}
