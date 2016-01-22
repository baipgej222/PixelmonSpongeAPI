package com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon.ImmutablePokemonLevelData;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.value.mutable.Value;

public interface MutablePokemonLevelData extends DataManipulator<MutablePokemonLevelData, ImmutablePokemonLevelData> {

    Value<Integer> level();

}
