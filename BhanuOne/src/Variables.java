import java.util.Scanner;
// Square and Perimeter of side
public class Variables {
    public static void main(String[] args) {
        //starts with _ or A-Z or $ can't use keywords
        // employee student address accepted variables

//        DATATYPE
         //type of value that is going to be stored in variable
//        two types -- primitive and non-primitive
        //primitive datatype means predefined
        // always have any  value if u have not assigned any it will be null
        //all will be of lower case
        //int long float double
        //numerical,char,true/false,
        //byte->-128 to 127
        //short->-32767 to +32726
        //int->-2^31 to 2^31-1
        //long->-2^63 to 2^63-1

        //float->7 after decimal
        //double->16 after decimal

        //char->a,b,c 1,2,3
        //boolean->True/False





        //non-primitive datatype means it is created by programmer not defined
        //exception is there in non-primitive type that is String
        //upper case
        //string array
        //they refer objects to java
        //string  stores group of characters


        int side;
        System.out.println("Enter the side :");
        //scanner is basically a class in java
        //using new keyword we create its object
        Scanner scanner = new Scanner(System.in);
        side =  scanner.nextInt();

        System.out.println("enter the name :");
        String name = scanner.next();
//        if we take next line then it would be best
        //Area of a Square
        int area = side*side;
        //Perimeter of a square
        int perimeter = 4*side;

        System.out.println("area "+"of "+name+" is :"+area);
        System.out.println("perimeter "+" of "+name+" is :"+perimeter);
//        System.out.println(name);






    }

}
