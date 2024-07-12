## KeybindTweaker
A crafttweaker addon provides support for keybinds.  

Currently adds these methods:  

```
//Don't forget to import!
import crafttweaker.text.ITextComponent;

//Text component for keybinds  
//ITextComponent.fromKeybind(String name);
ITextComponent.fromKeybind("key.attack");

//Text component for scoreboard and entity selector  
//ITextComponent.fromScore(String entityName,String objective);
ITextComponent.fromScore("Developer","test_objective");

//ITextComponent.fromSelector(String name);
ITextComponent.fromSelector("@p");
```
### Example:  
Adds attack key to crafting table's tooltip
```
import crafttweaker.text.ITextComponent;
import crafttweaker.item.ITooltipFunction;
var kb1 = ITextComponent.fromKeybind("key.attack");
//Use advanced tooltip so tooltip updates after player changed the keybind
<minecraft:crafting_table>.addAdvancedTooltip(function(item) {   
    //Call formattedText to get text for the tooltip
    return kb1.formattedText;
});
```