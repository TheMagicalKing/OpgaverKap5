import java.util.Scanner;
public class OpgaveFem_Et {

    public static void main(String[] args) {

       examCalc();

        }

        public  static boolean examCalc() {
            Scanner input = new Scanner(System.in);
            boolean i = true;
            while (i = true) {
                System.out.println("Please input your test scores!");
                int examScore = input.nextInt();
                if (examScore >= 60)
                    System.out.println("You have passed the exam!");
                else if (examScore < 60 && examScore > 0)
                    System.out.println("You have failed the exam!");
                else if (examScore == -1)
                    System.out.println("Exiting program");
                    return i = false;

            }
            return i = false;
        }
    }

