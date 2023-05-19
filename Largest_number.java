import java.util.Scanner;

public class Largest_number{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = in.nextInt();
            System.out.println("Enter the second number");
            int b = in.nextInt();
            System.out.println("Enter the third number");
            int c = in.nextInt();



            int max = a;
            if(b>max){
                max=b;
            }
            if (c>max){
                max=c;
            }
            System.out.println("The Largest number is "+max);


    }
}
