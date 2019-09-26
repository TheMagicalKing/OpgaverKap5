import java.util.*;
public class OpgaveFem_Otte {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of students you have");
        int numOfStudents = input.nextInt();
        System.out.print("Enter student name:");
        String student1 = input.next();
        System.out.print("Enter student score:");
        int score1 = input.nextInt();

        for (int i = 0; i < numOfStudents - 1; i++) {
            System.out.print("Enter student name:");
            String student = input.next();
            System.out.print("Enter student score:");
            int score = input.nextInt();

            if (score > score1) {
                student1 = student;
                score1 = score;




            }
        }
        System.out.println("Top student " + student1 + "'s score is " + score1);
    }
}


