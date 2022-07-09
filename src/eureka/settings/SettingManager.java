package eureka.settings;

import eureka.modules.Module;

import java.util.ArrayList;
import java.util.List;

public class SettingManager {
    private static final List<Setting<?>> settings = new ArrayList<>();

    public static List<Setting<?>> getSettings(Class<? extends Module> clazz) {
        return getSettings().stream().filter(setting -> setting.module.name.equals(clazz.getSimpleName())).distinct().toList();
    }

    public static List<Setting<?>> getSettings() {
        return settings;
    }
}
