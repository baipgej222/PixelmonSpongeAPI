package com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.pixelmon;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.pixelmon.ImmutableBaseStatsData;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.value.mutable.Value;

public interface MutableBaseStatsData extends DataManipulator<MutableBaseStatsData, ImmutableBaseStatsData> {

    Value<Integer> hp();
    Value<Integer> attack();
    Value<Integer> defense();
    Value<Integer> spAttack();
    Value<Integer> spDefense();
    Value<Integer> speed();

}
