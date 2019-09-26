import java.util.*;
public class OpgaveFem_Fyrre {
    public static void main(String[] args) {
        int number, sum = 0, count;
        int heads = 0;
        int tails = 0;


        for (count=0;count<2000000;count++){
            int randoflip = (int)(Math.random()*2);
            if (randoflip==1){
                heads +=1;
            }
            else
                tails+=1;

        }
        System.out.println("This is how many times the coin landed on heads: " + heads );
        System.out.println("And this is how many times the coin landed on tails "+ tails);
    }
}
