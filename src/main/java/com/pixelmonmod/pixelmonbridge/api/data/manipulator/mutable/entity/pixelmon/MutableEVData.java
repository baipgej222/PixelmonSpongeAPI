package com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon.ImmutableEVData;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.value.mutable.Value;

public interface MutableEVData extends DataManipulator<MutableEVData, ImmutableEVData> {

    Value<Integer> hpEVS();
    Value<Integer> attackEVS();
    Value<Integer> defenseEVS();
    Value<Integer> spAttackEVS();
    Value<Integer> spDefenseEVS();
    Value<Integer> speedEVS();

}
