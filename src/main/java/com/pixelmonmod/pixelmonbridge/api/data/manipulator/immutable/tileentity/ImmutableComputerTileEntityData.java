package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.tileentity;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.tileentity.MutableComputerTileEntityData;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.type.DyeColor;
import org.spongepowered.api.data.value.immutable.ImmutableOptionalValue;
import org.spongepowered.api.data.value.immutable.ImmutableValue;

import java.util.UUID;

public interface ImmutableComputerTileEntityData extends ImmutableDataManipulator<ImmutableComputerTileEntityData, MutableComputerTileEntityData> {

    ImmutableOptionalValue<UUID> owner();
    ImmutableValue<DyeColor> color();
    ImmutableValue<Boolean> raveMode();

}
