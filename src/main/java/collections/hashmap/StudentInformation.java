package collections.hashmap;

import collections.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentInformation {

    public Student getStudentInfo(String name) {
        Map<String, Student> map = new HashMap<>();
        map.put("Siri", new Student("Siri", "A", 3.2));
        map.put("Chandana", new Student("Chandana", "B", 3.1));
        map.put("Mallika", new Student("G", "Ch", 3.2));
        map.put("Ramya", new Student("A", "Y", 2.9));

        return  map.get(name);
    }
}
