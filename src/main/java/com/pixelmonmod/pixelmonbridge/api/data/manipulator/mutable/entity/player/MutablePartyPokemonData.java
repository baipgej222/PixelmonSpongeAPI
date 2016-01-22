package com.pixelmonmod.pixelmonbridge.api.data.manipulator.mutable.entity.player;

import com.pixelmonmod.pixelmonbridge.api.data.manipulator.immutable.entity.player.ImmutablePartyPokemonData;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.value.mutable.MapValue;
import org.spongepowered.api.entity.EntitySnapshot;
import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.player.Player;

import java.util.Optional;

public interface MutablePartyPokemonData extends DataManipulator<MutablePartyPokemonData, ImmutablePartyPokemonData> {

    MapValue<Integer, EntitySnapshot> partyPokemon();
    void healAll();
    Optional<EntitySnapshot> getSlotPokemon(int slot);

}
