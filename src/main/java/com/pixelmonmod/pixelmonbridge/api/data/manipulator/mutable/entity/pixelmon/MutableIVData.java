package com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon.ImmutableIVData;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.value.mutable.Value;

public interface MutableIVData extends DataManipulator<MutableIVData, ImmutableIVData> {

    Value<Integer> hpIVS();
    Value<Integer> attackIVS();
    Value<Integer> defenseIVS();
    Value<Integer> spAttackIVS();
    Value<Integer> spDefenseIVS();
    Value<Integer> speedIVS();

}
