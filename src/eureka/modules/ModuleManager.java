package eureka.modules;

import eureka.modules.Module;
import eureka.settings.Setting;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    private static final List<Module> modules = new ArrayList<>();

    public static void register(Module module) {
        modules.add(module);
    }

    public static void registerAll(Module... modules) {
        for (Module module : modules) {
            register(module);
        }
    }

    public static Module getModule(Class<? extends Module> clazz) {
        return getModules().stream().filter(module -> module.name.equals(clazz.getSimpleName())).findAny().get();
    }
    public static List<Module> getModules() {
        return modules;
    }
}
