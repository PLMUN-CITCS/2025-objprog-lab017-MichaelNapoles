import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        int score = getStudentScore();
        System.out.println("Your grade is: " + calculateGrade(score));

    }

    public static int getStudentScore(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert your grades: ");
        int score = input.nextInt();

        input.close();

        return score;
    }

    public static String calculateGrade(int score){
        String grade = "";
        if (score >= 90){
            grade = "A";
        }
        else if (score >= 80 && score <= 89){
            grade = "B";
        }
        else if (score >= 70 && score <= 79){
            grade = "C";
        }
        else if (score >= 60 && score <= 69){
            grade = "D";
        }
        else if (score < 60){
            grade = "F";
        }

        return grade;

    }

}