class Student {
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

}

public class Getset {
    public static void main(String[] args) {
        Student s = new Student();
        s.setname("Reyan");
        System.out.println(s.getname());
    }

}