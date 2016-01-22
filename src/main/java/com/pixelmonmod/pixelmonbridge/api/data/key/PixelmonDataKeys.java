package com.pixelmonmod.pixelmonbridge.api.data.key;

import static org.spongepowered.api.data.DataQuery.of;

import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.key.KeyFactory;
import org.spongepowered.api.data.type.DyeColor;
import org.spongepowered.api.data.value.mutable.ListValue;
import org.spongepowered.api.data.value.mutable.MapValue;
import org.spongepowered.api.data.value.mutable.OptionalValue;
import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.entity.EntitySnapshot;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class PixelmonDataKeys {

    /**
     * Pokemon specific keys
     */
    public static final Key<Value<Integer>> POKEMON_HP_EVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonEvsHP"));
    public static final Key<Value<Integer>> POKEMON_ATTACK_EVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonEvsAttack"));
    public static final Key<Value<Integer>> POKEMON_DEFENSE_EVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonEvsDefense"));
    public static final Key<Value<Integer>> POKEMON_SP_ATTACK_EVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonEvsSpAttack"));
    public static final Key<Value<Integer>> POKEMON_SP_DEFENSE_EVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonEvsSpDefense"));
    public static final Key<Value<Integer>> POKEMON_SPEED_EVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonEvsSpeed"));

    public static final Key<Value<Integer>> POKEMON_HP_IVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonIvsHP"));
    public static final Key<Value<Integer>> POKEMON_ATTACK_IVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonIvsAttack"));
    public static final Key<Value<Integer>> POKEMON_DEFENSE_IVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonIvsDefense"));
    public static final Key<Value<Integer>> POKEMON_SP_ATTACK_IVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonIvsSpAttack"));
    public static final Key<Value<Integer>> POKEMON_SP_DEFENSE_IVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonIvsSpDefense"));
    public static final Key<Value<Integer>> POKEMON_SPEED_IVS = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonIvsSpeed"));

    public static final Key<Value<Integer>> POKEMON_HP = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonHP"));
    public static final Key<Value<Integer>> POKEMON_ATTACK = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonAttack"));
    public static final Key<Value<Integer>> POKEMON_DEFENSE = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonDefense"));
    public static final Key<Value<Integer>> POKEMON_SP_ATTACK = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonSpAttack"));
    public static final Key<Value<Integer>> POKEMON_SP_DEFENSE = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonSpDefense"));
    public static final Key<Value<Integer>> POKEMON_SPEED = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonSpeed"));

    public static final Key<Value<Integer>> POKEMON_LEVEL = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonLevel"));
    public static final Key<Value<Float>> POKEMON_SCALE = KeyFactory.makeSingleKey(Float.class, Value.class, of("pokemonScale"));
    public static final Key<Value<String>> POKEMON_GROWTH = KeyFactory.makeSingleKey(String.class, Value.class, of("pokemonGrowth"));
    public static final Key<Value<Integer>> POKEMON_VARIANT = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonVariant"));
    public static final Key<Value<String>> POKEMON_GENDER = KeyFactory.makeSingleKey(String.class, Value.class, of("pokemonGender"));
    public static final Key<Value<Boolean>> POKEMON_PLAYER_OWNED = KeyFactory.makeSingleKey(Boolean.class, Value.class, of("pokemonPlayerOwned"));
    public static final Key<Value<Boolean>> POKEMON_FAINTED = KeyFactory.makeSingleKey(Boolean.class, Value.class, of("pokemonFainted"));
    public static final Key<Value<String>> POKEMON_CAUGHT_BALL = KeyFactory.makeSingleKey(String.class, Value.class, of("pokemonCaughtBall"));
    public static final Key<Value<String>> POKEMON_NATURE = KeyFactory.makeSingleKey(String.class, Value.class, of("pokemonNature"));
    public static final Key<Value<Integer>> POKEMON_EXP = KeyFactory.makeSingleKey(Integer.class, Value.class, of("pokemonEXP"));

    public static final Key<Value<String>> POKEMON_NAME = KeyFactory.makeSingleKey(String.class, Value.class, of("pokemonName"));
    public static final Key<Value<String>> POKEMON_NICK_NAME = KeyFactory.makeSingleKey(String.class, Value.class, of("pokemonNickName"));
    public static final Key<Value<String>> POKEMON_BOSS_MODE = KeyFactory.makeSingleKey(String.class, Value.class, of("pokemonBossMode"));
    public static final Key<ListValue<Integer>> POKEMON_ID = KeyFactory.makeListKey(Integer.class, of("pokemonID"));

    /**
     * Player specific keys
     */
    public static final Key<MapValue<Integer, EntitySnapshot>> PARTY_POKEMON = KeyFactory.makeMapKey(Integer.class, EntitySnapshot.class, of("partyPokemon"));
    public static final Key<MapValue<Integer, Map<Integer, EntitySnapshot>>> COMPUTER_POKEMON = KeyFactory.makeMapKey(Integer.class, (Class<Map<Integer, EntitySnapshot>>)(Class)Map.class, of("computerPokemon"));

    /**
     * Chatting npc specific keys
     */
    public static final Key<ListValue<String>> CHAT_PAGES = KeyFactory.makeListKey(String.class, of("chatPages"));

    /**
     * PC Tile Entity Specific keys
     */
    public static final Key<OptionalValue<UUID>> COMPUTER_OWNER = KeyFactory.makeSingleKey((Class<Optional<UUID>>) (Class) Optional.class, OptionalValue.class, of("computerOwner"));
    public static final Key<Value<DyeColor>> COMPUTER_COLOR = KeyFactory.makeSingleKey(DyeColor.class, Value.class, of("computerColor"));
    public static final Key<Value<Boolean>> COMPUTER_RAVE_MODE = KeyFactory.makeSingleKey(Boolean.class, Value.class, of("computerRaveMode"));

    /**
     * Pixelmon Spawner Tile Entity Specific keys
     */




}
