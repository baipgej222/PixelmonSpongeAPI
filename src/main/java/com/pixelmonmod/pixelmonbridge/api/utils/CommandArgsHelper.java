package com.pixelmonmod.pixelmonbridge.api.utils;

import org.spongepowered.api.command.args.CommandElement;
import org.spongepowered.api.text.Text;

public interface CommandArgsHelper {

    /**
     * Used for a number between 1-6 as input, automatically deducts 1 from the value saved to the commandcontext
     * if emptyallowed is set to false, it will verify there is a pokemon in the party slot and throw a excpetion otherwise
     * @param key
     * @param emptyAllowed
     * @return
     */
    CommandElement ownPartySlotNumber(Text key, boolean emptyAllowed);

}
