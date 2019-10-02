public class Instructor extends Person implements Teacher {
    Instructor(String name, long id) {
        super(name, id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner i : learners){
            i.learn(numberOfHours / learners.length);
        }
    }
}
