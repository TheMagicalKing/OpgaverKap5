import java.util.*;
public class OpgaveFem_ToOgTyve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert annual interest rate");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate/1200;

        System.out.println("Insert number of years for your loan");
        int numberOfYears = input.nextInt();

        System.out.println("Insert loan amount");
        double balance = input.nextDouble();

        double monthlyPayment = balance*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
        double totalPayment = monthlyPayment*numberOfYears*12;
        double principal = monthlyPayment-monthlyInterestRate;
        double interest = monthlyInterestRate*balance;
        System.out.println("payment#\t\tinterest\t\t\tprincipal\t\t\t\tbalance");
        for (int i = 1; i<=numberOfYears*12; i++){
            principal = monthlyPayment-monthlyInterestRate;
            interest = monthlyInterestRate*balance;
            balance = balance-principal;
            System.out.println(i+"\t\t"+interest+"\t\t"+principal+"\t\t"+balance);

        }

    }
}

