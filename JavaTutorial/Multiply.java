import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Insert first multiplicand : ");
        int x =kb.nextInt();
        System.out.print("Insert last multiplicand : ");
        int y =kb.nextInt();
        System.out.println();

        for(int m=x;m<=y;m++){
            System.out.println("Multiple of "+m);
            System.out.println();
            for(int i=1;i<=12;i++){
                System.out.println(+m+" x "+i+ " = "+(m*i) );
                if(i==12) System.out.println();
            }
        }
        
            
     }
    
}
