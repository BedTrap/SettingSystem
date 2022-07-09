package eureka.settings.imp;

import eureka.modules.Module;
import eureka.settings.Setting;
import eureka.settings.SettingManager;

public class IntegerSettings extends Setting<Integer> {
    public IntegerSettings() {

    }

    private IntegerSettings(String name, int value, int min, int max, Module module) {
        this.name = name;
        this.value = value;
        this.min = min;
        this.max = max;
        this.module = module;
    }

    public Setting<Integer> register(String name, int value, int min, int max, Module module) {
        Setting<Integer> setting = new IntegerSettings(name, value, min, max, module);
        SettingManager.getSettings().add(setting);
        return setting;
    }
}
