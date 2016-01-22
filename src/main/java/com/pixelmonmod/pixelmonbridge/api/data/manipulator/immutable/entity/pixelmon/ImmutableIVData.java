package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon;

import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.immutable.ImmutableValue;
import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon.MutableIVData;

public interface ImmutableIVData extends ImmutableDataManipulator<ImmutableIVData, MutableIVData> {

    ImmutableValue<Integer> hpIVS();
    ImmutableValue<Integer> attackIVS();
    ImmutableValue<Integer> defenseIVS();
    ImmutableValue<Integer> spAttackIVS();
    ImmutableValue<Integer> spDefenseIVS();
    ImmutableValue<Integer> speedIVS();

}
