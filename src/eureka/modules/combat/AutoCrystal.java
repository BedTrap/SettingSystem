package eureka.modules.combat;

import eureka.modules.Module;
import eureka.settings.imp.BooleanSetting;
import eureka.settings.imp.IntegerSettings;
import eureka.settings.Setting;

public class AutoCrystal extends Module {
    public Setting<Boolean> doPlace = new BooleanSetting().register("Place", true, this);
    public Setting<Integer> placeDelay = new IntegerSettings().register("PlaceDelay", 0, 0, 20, this);

    public AutoCrystal() {
        super(Category.Combat, "Automatically places and blows up crystals.");
    }
}
