package Game.entity;

public class Gift {
    private String name;
    private int golden;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGolden() {
        return golden;
    }

    public void setGolden(int golden) {
        this.golden = golden;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Gift(String name, int golden, String content) {
        this.name = name;
        this.golden = golden;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", golden=" + golden +
                ", content='" + content + '\'' +
                '}';
    }
}

