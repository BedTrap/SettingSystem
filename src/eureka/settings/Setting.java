package eureka.settings;

import eureka.modules.Module;

public class Setting<T> {
    public String name;
    public T value;
    public int min, max;
    public Module module;

    public Setting() {

    }

    public T get() {
        return value;
    }
}
