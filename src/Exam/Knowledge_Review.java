package Exam;

public class Knowledge_Review {
    public int totalPoints = 0;
    public boolean question_1;
    public boolean question_2;
    public boolean question_3;
    public boolean question_4;
    public boolean question_5;

    public void exam(){

        if (question_1 == true){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_2 == true){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_3 == false){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_4 == true){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_5 == false){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }

        System.out.println("Total points obtained: " + totalPoints);
    }
}

