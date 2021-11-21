package Heima.Set.Anli;

public class Student {
    private String name;
    private int cg;
    private int mg;

    public Student() {
    }

    public Student(String name, int cg, int mg) {
        this.name = name;
        this.cg = cg;
        this.mg = mg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCg() {
        return cg;
    }

    public void setCg(int cg) {
        this.cg = cg;
    }

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }

    public int getSum(){
        return (this.cg+this.mg);
    }
}
