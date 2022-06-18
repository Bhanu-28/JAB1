import java.util.Scanner;

public class ProgramFive {
    //product of numbers upto n
    public static void main(String[] args) {
        int fact;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        fact = input.nextInt();
        int prod=1;
        for(int i=1;i<=fact;i++)//this is for each loop for i=1 i<=5 true
            // then 5*1 later 5*4 like that
        {
            prod = prod*i;
        }
        System.out.println(prod);
    }
}
