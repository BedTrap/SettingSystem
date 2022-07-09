package eureka.modules.combat;

import eureka.modules.Module;
import eureka.settings.Setting;
import eureka.settings.imp.StringSettings;

public class AutoEZ extends Module {
    public Setting<String> message = new StringSettings().register("Message", "GOOFY AHHH", this);

    public AutoEZ() {
        super(Category.Combat,"Sends goofy message on kill.");
    }
}
