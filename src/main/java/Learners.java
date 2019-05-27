import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Learners {
    private String fName,lName,Email;
    Map<String, Integer>learners;
    int counter=0;              //-----SUPPOSE TO BE THE COUNTER OF SUBJECTS ----- //

    public Learners(String fullName, String lastName, String email){
        this.fName =fullName;
        this.lName = lastName;
        this.Email = email;
        learners = new HashMap<String, Integer>();
    }

    public String getfName(){
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail(){
        return Email;
    }

    public String addLearner(Learners student){
         if(!learners.isEmpty()){
                learners.put(student.getfName(), counter+1);
            }else{
                learners.put(student.getfName(),1);
            }
        return learners.toString();
    }

    public int getNumberOfAllLearners() {
        return learners.size();
    }
}
