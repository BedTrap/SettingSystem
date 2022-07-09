package eureka.settings.imp;

import eureka.modules.Module;
import eureka.settings.Setting;
import eureka.settings.SettingManager;

public class BooleanSetting extends Setting<Boolean> {
    public BooleanSetting() {

    }

    private BooleanSetting(String name, boolean value, Module module) {
        this.name = name;
        this.value = value;
        this.module = module;
    }

    public Setting<Boolean> register(String name, boolean value, Module module) {
        Setting<Boolean> setting = new BooleanSetting(name, value, module);
        SettingManager.getSettings().add(setting);
        return setting;
    }
}
