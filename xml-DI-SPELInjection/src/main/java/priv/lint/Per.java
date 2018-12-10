package priv.lint;

public class Per {
    String name;
    int id;

    @Override
    public String toString() {
        return "Per{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int toStudentAge(){
        return 18;
    }
}
