package Step6;

public class Topic {
    public Topic(String id, String name) {
        this.id = id;
        this.name = name;
    }
public Topic() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id;
    private String name;

}