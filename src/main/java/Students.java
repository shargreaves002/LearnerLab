import java.util.ArrayList;
import java.util.Arrays;

public class Students extends People {
    private static final Students INSTANCE = new Students();
    private static ArrayList<Student> students = new ArrayList<>();

    private Students () {
        students.addAll(Arrays.asList(new Student("Sarah", 1),
                                    new Student("Carlos", 2),
                                    new Student("Aubrey", 3),
                                    new Student("Serafin", 4),
                                    new Student("Bailey", 5),
                                    new Student("Ryan", 6),
                                    new Student("Imani", 7),
                                    new Student("Najea", 8),
                                    new Student("Christian", 9),
                                    new Student("Malcolm", 10),
                                    new Student("Ray", 11),
                                    new Student("David", 12),
                                    new Student ("Morenzo", 13),
                                    new Student("Shishonah", 14)));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student getStudents(int index) {
        return students.get(index);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
