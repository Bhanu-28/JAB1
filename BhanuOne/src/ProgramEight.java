import java.util.Scanner;

public class ProgramEight {
    public static void main(String[] args) {
        int sum1,sum2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter score of A :");
        sum1= sc.nextInt();
        System.out.println("enter score of B :");
        sum2=sc.nextInt();

        if(sum1+sum2>30){
            System.out.println("The persons are telling the truth ");
        }else{
            System.out.println("die for lie ");
        }
    }
}
