package adinda.stroopwafel;

import adinda.stroopwafel.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stroopwafel implements ModInitializer {
	public static final String MOD_ID = "stroopwafel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}