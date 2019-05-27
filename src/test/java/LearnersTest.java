import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LearnersTest {

    @Test
    public void acceptLearner() {
        Learners learner = new Learners("Sbu","Langa","sbu@gmail.com");

//        System.out.println(learner.getfName());
        assertEquals("Sbu",learner.getfName());
        assertEquals("Langa",learner.getlName());
        assertEquals("sbu@gmail.com",learner.getEmail());

    }

    @Test
    public void addLearners(){
        Learners student = new Learners("Mzwa","Louw", "mzwa@gmail.com");
        Learners student2 = new Learners("Sbu","Langa", "sbu@gmail.com");
        Learners student3 = new Learners("Sipho","Gee", "geeSipho@gmail.com");

        System.out.println(Subjects.AFRIKAANS);

        System.out.println(student.addLearner( student ) );
        System.out.println(student.addLearner( student2 ) );
        System.out.println(student.addLearner( student3 ) );

//        assertEquals(student.addLearner( student ) ,"Mzwa");
    }
    @Test
    public void numberOfLearners(){
        Learners student = new Learners("Mzwa","Louw", "mzwa@gmail.com");
        Learners student2 = new Learners("Sbu","Langa", "sbu@gmail.com");
        Learners student3 = new Learners("Sipho","Gee", "geeSipho@gmail.com");

        student.addLearner(student);
        student.addLearner(student2);
        student.addLearner(student3);

        assertEquals(3,student.getNumberOfAllLearners());
    }

}