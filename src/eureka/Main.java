package eureka;

import eureka.modules.ModuleManager;
import eureka.modules.Module;
import eureka.modules.combat.AutoCrystal;
import eureka.modules.combat.AutoEZ;
import eureka.modules.combat.Burrow;
import eureka.settings.Setting;
import eureka.settings.SettingManager;

public class Main {
    public static void main(String[] args) {
        // Registration
        ModuleManager.registerAll(
                new Burrow(),
                new AutoCrystal(),
                new AutoEZ()
        );

        // Iterating modules and settings
        for (Module module : ModuleManager.getModules()) {
            System.out.println("[" + module.name + "] " + module.category + ", " + module.description);

            for (Setting<?> setting : SettingManager.getSettings()) {
                if (!setting.module.name.equals(module.name)) continue;

                System.out.println("[" + setting.module.name + "] " + setting.name + ", " + setting.value + ".");
            }
        }

        // Get by module and settings by class
        Module module = ModuleManager.getModule(AutoCrystal.class);
        System.out.println("[" + module.name + "] " + module.category + ", " + module.description);

        for (Setting<?> setting : SettingManager.getSettings(AutoCrystal.class)) {
            System.out.println("[" + setting.module.name + "] " + setting.name + ", " + setting.value + ".");
        }
    }
}
