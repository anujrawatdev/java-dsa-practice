package Src;
import java.util.*;

class Student {
    public int age;
    String name;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return s1.age - s2.age;
    }
}
public class Main{
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 21));
        students.add(new Student("Anuj", 20));
        students.add(new Student("pappu", 19));
        students.add(new Student("Saurav", 17));
        students.add(new Student("Aman", 15));
        students.add(new Student("Lakku", 12));

        Collections.sort(students, new AgeComparator());

        for(Student s:students){
            System.out.println(s.name + " " + s.age);
        }
    }
}
