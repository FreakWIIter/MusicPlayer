package School;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Collectors;

public class Journal {
    ArrayList<Student> student =  new ArrayList();
    List<String>name = new ArrayList<>();
    /*for(Student st:student){
        if(st.getSchool.equals("1")){
            name.add(st.getName());
        }
            System.out.println(st.getName());*/ 
    student.stream()
    filter(stud->stud.getSchool().equals("1"))
    .map(stud->stud.getName())
    .collect(Collectors.toList())
    subject.stream()
    .map(Subject::getName())
    .collect(Collectors.toList())
    
    student.stream()
    fiter(stud->stud.getSchool().equals("1"))
    .map(stud->stud.getTime())
    .collect(Collectors.toList())
    subject.stream()
    .map(Subject::getTime())
    .collect(Collectors.toLsit())
    System.out.println(getSchool);
}