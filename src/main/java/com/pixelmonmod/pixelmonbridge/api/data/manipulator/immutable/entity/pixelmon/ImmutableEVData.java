package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon;

import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.immutable.ImmutableValue;
import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon.MutableEVData;

public interface ImmutableEVData extends ImmutableDataManipulator<ImmutableEVData, MutableEVData> {

    ImmutableValue<Integer> hpEVS();
    ImmutableValue<Integer> attackEVS();
    ImmutableValue<Integer> defenseEVS();
    ImmutableValue<Integer> spAttackEVS();
    ImmutableValue<Integer> spDefenseEVS();
    ImmutableValue<Integer> speedEVS();

}
