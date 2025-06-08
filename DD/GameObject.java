package DD;

public abstract class GameObject {
    protected String name;

    public GameObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
