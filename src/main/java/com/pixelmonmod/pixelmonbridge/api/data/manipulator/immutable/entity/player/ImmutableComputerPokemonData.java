package com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.player;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.player.MutableComputerPokemonData;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.immutable.ImmutableMapValue;
import org.spongepowered.api.entity.EntitySnapshot;

import java.util.Map;

public interface ImmutableComputerPokemonData extends ImmutableDataManipulator<ImmutableComputerPokemonData, MutableComputerPokemonData> {

    ImmutableMapValue<Integer, Map<Integer, EntitySnapshot>> computerPokemon();

}
