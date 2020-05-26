package stream;

public class Student {
    private int age;
    private String name;
    private String stunt;

    public Student(int age, String name, String stunt) {
        this.age = age;
        this.name = name;
        this.stunt = stunt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStunt() {
        return stunt;
    }

    public void setStunt(String stunt) {
        this.stunt = stunt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stunt='" + stunt + '\'' +
                '}';
    }
}
