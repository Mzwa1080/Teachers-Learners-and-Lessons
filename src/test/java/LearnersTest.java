import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LearnersTest {

    @Test
    public void acceptLearner() {
        Learners learner = new Learners("Sbu", "Langa", "sbu@gmail.com");

//        System.out.println(learner.getfName());
        assertEquals("Sbu", learner.getfName());
        assertEquals("Langa", learner.getlName());
        assertEquals("sbu@gmail.com", learner.getEmail());

    }

    @Test
    public void addLearners() {
        Learners student = new Learners("Mzwa", "Louw", "mzwa@gmail.com");

        student.addSubject(Subjects.ISIXHOSA);
        student.addSubject(Subjects.PHYSICS);
        student.addSubject(Subjects.LIFESCIENCE);

        System.out.println(student.subjects);
        System.out.println(student.subjectCounter());

        assertEquals(3, student.subjectCounter());
    }


    @Test
    public void addToLesson() {
        Learners student = new Learners("Mzwa", "Louw", "lmzwa@codex.co");
        Lesson lesson = new Lesson(Subjects.ISIXHOSA);

        lesson.addToClass(student);

        System.out.println(lesson.addToClass(student));
//        lesson.startLesson();
//        lesson.endLesson(); //checks if list.size >= 5 => return sucessfull

    }
}