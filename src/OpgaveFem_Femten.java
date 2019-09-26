public class OpgaveFem_Femten {

    public static void main(String[] args) {
        for (int j = 1;j<=10; j++)
            System.out.print(" " + j);
        System.out.println("\n---------------------------");
        for (int i = 1; i <= 10; i++){
            System.out.print( i + " | ");
            for (int j = 33; j <= 126; j++){
                if(j%10 == 0){
                    System.out.println();
                }
                System.out.printf("%4d : %c", (int)j, j);

            }
            System.out.println();
        }

    }
}

/**
 int l;
 System.out.println("");
 for (l = 33; l <= 126; l++){
 System.out.print( (char)l + " " );
 //print a newline every 10th loop, using modulus operator'

 if(l%10 == 0){
 System.out.println();
 }
 }

 for (int i =1;i<=10;i++){
 System.out.print(i+" | ");
 for (int j = 1; j<=10;j++){
 System.out.print(j);
 for (int l = 21; l<=126;l++){
 char m = (char)l;
 System.out.printf("%4d",m);
 }
 }
 System.out.println();
 }
 **/