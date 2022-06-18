import java.util.Scanner;

public class ProgramThree {
//Divisble by 5 and 3
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = scanner.nextInt();
        //if (num%5==0 && num%3==0) sout
        if(num%5==0 && num%3==0)
        //Short--circuiting Logical and and logical or
            //and means both are true and or any one
        {
            System.out.println("BOTH 5 & 3 divisible");
        }
        else if(num%5==0){
            System.out.println("div by 5");
        }else if(num%3==0){
            System.out.println("div by 3");
        }else{
            System.out.println("Not divisible by 5 and 3 ");
        }

    }
}
