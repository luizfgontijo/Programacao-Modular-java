package entities;

public class Student {
    public String name;
    public int gradeOne;
    public int gradeTwo;
    public int gradeThree;
    
    public int finalGrade(){
        return gradeOne+gradeTwo+gradeThree;
    }
    
    public int passedOrFail(){
        if (finalGrade()>60){
            return 0;
        }
        else{
            return 60-finalGrade();
        }
    }
    
    public String toString(){
        return name
                + "\nFinal grade: "
                + finalGrade();
    }
            
          
}
