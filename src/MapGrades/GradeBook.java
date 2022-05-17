package MapGrades;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, String> grades;

    public GradeBook(){
        grades = new HashMap<>();
    }

    /**
     * @param name the name of the student being added
     * @param grade the current grade of the student being modify
     * @return whether it is null
     */
    public boolean addGrade(String name, String grade){
        if(grades.get(name) != null){
            return false;
        }
        grades.put(name, grade);
        return true;
    }

    /**
     * @param name name of the student whose grade is being updated
     * @param grade the grade being updated
     * @return whether it is null
     */
    public boolean updateGrade(String name, String grade){
        if(grades.get(name)!= null){
            grades.put(name,grade);
            return true;
        }
        return false;
    }

    /**
     * @param name name of the student to remove
     * @return whether it is null
     */
    public boolean removeGrade(String name){
        if(grades.get(name)!= null) {
            grades.remove(name);
            return true;
        }
        return false;
    }

    /**
     * @return returns the map of grades
     */
    public Map<String, String> getGrades(){
        return grades;
    }
}
