import java.util.HashMap;
import java.util.Map;

public class Learners extends Person{
    Map<String, Integer>subjects;
    int counter;
    public Learners(String fullName, String lastName, String email) {
        super(fullName,lastName,email);
        subjects = new HashMap<String, Integer>();
        counter = 0;
    }

    public Map<String, Integer> addSubject(Subjects subj){
        if(!subjects.containsKey(subj)){
            subjects.put(String.valueOf(subj),1);
        }else
            subjects.put(String.valueOf(subj), counter+1);

        return subjects;
    }

    public int subjectCounter(){
        return subjects.size();
    }
}

//    public String addLearner(Learners student){
//         if(!learners.isEmpty()){
//                learners.put(student.getfName(), counter+1);
//            }else{
//                learners.put(student.getfName(),1);
//            }
//        return learners.toString();
//    }
//
//    public int getNumberOfAllLearners() {
//        return learners.size();
//    }

