package Step4.V2;

public class Topic {
    public Topic(String id, String name) {
        this.id = id;
        this.name = name;
    }
public Topic() {}
    private String id;

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

    private String name;

}