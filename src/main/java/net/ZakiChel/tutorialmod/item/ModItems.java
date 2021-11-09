package net.ZakiChel.tutorialmod.item;


import net.ZakiChel.tutorialmod.TutorialMod;
import net.ZakiChel.tutorialmod.item.custom.SmartBlowTorchItem;
import net.ZakiChel.tutorialmod.item.custom.SmartCoordinatesTellerItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> SMART_BLOW_TORCH = ITEMS.register("smart_blow_torch",
            () -> new SmartBlowTorchItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).durability(128)));
    public static final RegistryObject<Item> COORDINATES_TELLER = ITEMS.register("smart_coords_teller",
            () -> new SmartCoordinatesTellerItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
