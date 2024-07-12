package io.bluebeaker.keybindtweaker;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.text.ITextComponent;
import net.minecraft.util.text.TextComponentKeybind;
import net.minecraft.util.text.TextComponentScore;
import net.minecraft.util.text.TextComponentSelector;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethodStatic;

/**
 * @author Blue_Beaker
 */
@ZenRegister
@ZenExpansion("crafttweaker.text.ITextComponent")
public class ExpandTextComponent {
    @ZenMethodStatic
    public static ITextComponent fromKeybind(String keybind) {
        return CraftTweakerMC.getITextComponent(new TextComponentKeybind(keybind));
    }
    @ZenMethodStatic
    public static ITextComponent fromScore(String name, String objective) {
        return CraftTweakerMC.getITextComponent(new TextComponentScore(name, objective));
    }
    @ZenMethodStatic
    public static ITextComponent fromSelector(String selector) {
        return CraftTweakerMC.getITextComponent(new TextComponentSelector(selector));
    }
    
}
