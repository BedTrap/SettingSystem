package eureka.settings.imp;

import eureka.modules.Module;
import eureka.settings.Setting;
import eureka.settings.SettingManager;

public class StringSettings extends Setting<String> {
    public StringSettings() {

    }

    private StringSettings(String name, String value, Module module) {
        this.name = name;
        this.value = value;
        this.module = module;
    }

    public Setting<String > register(String name, String value, Module module) {
        Setting<String> setting = new StringSettings(name, value, module);
        SettingManager.getSettings().add(setting);
        return setting;
    }
}
