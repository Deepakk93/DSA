import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();


    }
    static void arm(int n){
        int Sum= 0;
        while(n<0){
            int rem= n%10;
            n=n/10;
            Sum = Sum+rem*rem*rem;
        }
    }
}