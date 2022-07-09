package eureka.modules.combat;

import eureka.modules.Module;
import eureka.settings.imp.BooleanSetting;
import eureka.settings.Setting;

public class Burrow extends Module {
    public Setting<Boolean> fake = new BooleanSetting().register("Fake", true, this);

    public Burrow() {
        super(Category.Combat, "Automatically places obsidian in your feet.");
    }
}
