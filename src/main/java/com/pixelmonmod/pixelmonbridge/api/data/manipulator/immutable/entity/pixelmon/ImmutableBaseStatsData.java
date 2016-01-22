package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon.MutableBaseStatsData;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.immutable.ImmutableValue;

public interface ImmutableBaseStatsData extends ImmutableDataManipulator<ImmutableBaseStatsData, MutableBaseStatsData> {

    ImmutableValue<Integer> hp();
    ImmutableValue<Integer> attack();
    ImmutableValue<Integer> defense();
    ImmutableValue<Integer> spAttack();
    ImmutableValue<Integer> spDefense();
    ImmutableValue<Integer> speed();

}
