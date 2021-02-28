package School;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        ArrayList<String> lessons = new ArrayList<String>();
        lessons.add(new String("Math"));
        lessons.add(new String("Russian"));
        lessons.add(new String("English"));
        lessons.add(new String("Biology"));
        lessons.add(new String("Geography"));
        lessons.add(new String("Physical training"));
        lessons.add(new String("Music"));
        lessons.add(new String("History"));
        System.out.println(lessons);
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student()
        .setOld("17")
        .setKlass("11")
        .setName("John")
        .setShkola("13"));
        
        students.add(new Student()
        .setOld("14")
        .setKlass("8")
        .setName("Bob")
        .setShkola("5"));
        
        students.add(new Student()
        .setOld("16")
        .setKlass("9")
        .setName("Sara")
        .setShkola("13"));

        students.add(new Student()
        .setOld("13")
        .setKlass("6")
        .setName("Konor")
        .setShkola("5"));
        
        students.add(new Student()
        .setOld("18")
        .setKlass("11")
        .setName("Habib")
        .setShkola("34"));
        
        students.add(new Student()
        .setOld("7")
        .setKlass("1")
        .setName("Piter")
        .setShkola("34"));
        
        students.add(new Student()
        .setOld("9")
        .setKlass("3")
        .setName("Maksim")
        .setShkola("5"));        
    }
}
