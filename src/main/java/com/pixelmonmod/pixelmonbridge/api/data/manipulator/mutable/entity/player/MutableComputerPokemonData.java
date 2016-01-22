package com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.player;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.player.ImmutableComputerPokemonData;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.value.mutable.MapValue;
import org.spongepowered.api.entity.EntitySnapshot;
import org.spongepowered.api.entity.living.player.Player;

import java.util.Map;

public interface MutableComputerPokemonData extends DataManipulator<MutableComputerPokemonData, ImmutableComputerPokemonData> {

    MapValue<Integer, Map<Integer, EntitySnapshot>> computerPokemon();

}
