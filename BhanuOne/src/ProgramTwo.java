import java.util.Scanner;
public class ProgramTwo {
//Greater numbers
    public static void main(String[] args){

        int a,b;
        Scanner greater= new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        a = greater.nextInt();
        System.out.println("Enter the second number :");
        b = greater.nextInt();

        if(a>b){
            System.out.println(a);
            //we use single = when assigning
            //== when comparing whether both are equal

        } else if (a==b) {
            System.out.println("Both are Equal");
            
        }else{
            System.out.println(b);
        }



    }

}
