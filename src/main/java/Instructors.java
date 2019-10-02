import java.util.ArrayList;

class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();
    private static ArrayList<Instructor> instructors = new ArrayList<>();

    private Instructors () {
        instructors.add(new Instructor("Mikaila", 1));
    }

    public ArrayList getInstructors() {
        return instructors;
    }

    Instructor getInstructor(int index) {
        return instructors.get(index);
    }

    static Instructors getInstance(){
        return INSTANCE;
    }
}
