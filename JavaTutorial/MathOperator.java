import java.util.Scanner;
;public class MathOperator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1 stnumber = ");
        int a =sc.nextInt();
        System.out.print("Please enter 2nd number = ");
        int b =sc.nextInt();

        System.out.println("Sum = " +(a+b));
        System.out.println("Minus = " +(a-b));
        System.out.println("Multiple = " +(a*b));
        System.out.println("Divide = " +(a/b));
        System.out.println("Modulus = " +(a%b));
    }
    
}
