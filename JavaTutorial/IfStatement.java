import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);
        System.out.print("Input your age : ");
        int age = kb.nextInt();
        if(age>=15 && age<=19){
            //ถ้าจริงแล้ว..ทำอะไร
            System.out.println("Child ");
        
        }else if(age>=20 && age<=25){
            System.out.println("Teenager ");
        
        }else if(age>=26 && age<=39){
            System.out.println("Adult ");
        
        }else if(age>=40){
            System.out.println("Old man");
        }else{
            System.out.println("None");
        }
        
    }
    
}
