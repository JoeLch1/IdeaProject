package stream;

import java.util.ArrayList;

public class ListFilterTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(55,"欧阳锋","蛤蟆功"));
        students.add(new Student(28,"郭靖","降龙十八掌"));
        students.add(new Student(58,"洪七公","降龙十八掌"));
        students.add(new Student(68,"一灯大师","一阳指"));
        students.stream().filter(s->s.getAge()<60)
                .filter(s->"降龙十八掌".equals(s.getStunt()))
                .forEach(s-> System.out.println(s.toString()));
    }
}
