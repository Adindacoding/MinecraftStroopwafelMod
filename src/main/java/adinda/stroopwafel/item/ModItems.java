package adinda.stroopwafel.item;

import adinda.stroopwafel.Stroopwafel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STROOPWAFEL = registerItem("stroopwafel", new Item(new FabricItemSettings().food(ModFoodComponents.STROOPWAFEL)));

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Items.COOKIE, STROOPWAFEL);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Stroopwafel.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Stroopwafel.LOGGER.info("Registering Mod Items for " + Stroopwafel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems :: addItemsToFoodItemGroup);

    }

}
