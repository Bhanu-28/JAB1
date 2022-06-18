import java.util.Scanner;
public class ProgramSix {
    //fahrenheit to celsius
    public static void main(String[] args) {
//    T(oC)   =  ((T(oF)  -  32  ) ×  5)/9
//    T(oF)   =  (T(oC)   ×  9)/5) + 32
//    Float fahrenheit,celsius;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter fahrenheit ");
//        fahrenheit = sc.nextFloat();
//        celsius = ((fahrenheit-32)*5) /9;
//        System.out.println("current celsius is "+celsius);

        Float fahrenheit,celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current celsius :");
        celsius = input.nextFloat();
        System.out.println("Enter the celsius :");
        fahrenheit = ((celsius *9)/5)+32;
        System.out.println("Fahrenheit is :"+fahrenheit);




    }
}
