import java.util.HashMap;
import java.util.Iterator;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington() {}

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture (Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[]) students.getStudents().toArray(), numberOfHours);
    }

    public void hostLecture (long id, double numberOfHours){
        Instructor instructor = instructors.getInstructor((int) id);
        instructor.lecture((Learner[]) students.getStudents().toArray(), numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap (){
        HashMap<Student, Double> result = new HashMap<>();
        Iterator<Student> iter = students.getStudents().iterator();

        while (iter.hasNext()){
            Student student = iter.next();
            result.put(student, student.getTotalStudyTime());
        }
        return result;
    }
}
