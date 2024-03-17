import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan= new Scanner(System.in);
        int num = scan.nextInt();
        if(isHappy(num)) System.out.println("happy num");
        else System.out.println("not a happy num");
    }
    public static boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
           slow=sumOfSqrs(slow);
           fast=sumOfSqrs(sumOfSqrs(fast));
        }while (slow!=fast);

        if(slow==1) return true;
        return false;
    }
    private static int sumOfSqrs(int n){
        int result=0;
        while(n>0){
            int rem = n%10;
            result+= (rem*rem);
            n/= 10;
        }
        return result;
    }
}