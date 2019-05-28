import java.util.HashMap;
import java.util.Map;

public class Lesson {
    Map<String, String>classroom;
    Subjects subjects;

    public Lesson(Subjects subjects) {
        this.subjects = subjects;
        classroom = new HashMap<String,String>();
    }

    public String addToClass(Learners learner){
        if(!classroom.containsKey(learner)){
           classroom.put(String.valueOf(learner),String.valueOf(subjects));
        }
//            classroom.put(learner.getfName(), );
        return classroom.toString();
    }

    public int howManyLearners(){ //USE TO START A CLASS OR A LESSON
        return classroom.size();
    }
}
