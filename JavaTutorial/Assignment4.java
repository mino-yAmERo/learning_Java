import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input your year of birth(B.E.) = ");
        int age = kb.nextInt();
        
        int result = age-543;
        System.out.println("Your year of birth(A.D.) = "+result);

    }
}
