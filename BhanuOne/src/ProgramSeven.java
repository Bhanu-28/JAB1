import java.util.Scanner;

public class ProgramSeven {
    public static void main(String[] args) {
        //simple interest si=pnr/100
        int p;
        Float n,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("principle");
        p = sc.nextInt();
        System.out.println("time");
        n=sc.nextFloat();
        System.out.println("rate");
        r=sc.nextFloat();

       Float  simpleInterest = (p*n*r)/100;
        System.out.println("simple interest is :"+simpleInterest);
        System.out.print("total is :");
        System.out.println(p+simpleInterest);


    }
}
