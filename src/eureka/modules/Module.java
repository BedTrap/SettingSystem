package eureka.modules;

public class Module {
    public Category category;
    public String name;
    public String description;

    public Module() {

    }

    public Module(Category category, String description) {
        this.category = category;
        this.name = this.getClass().getSimpleName();
        this.description = description;
    }

    public enum Category {
        Combat, Misc, Render
    }
}
