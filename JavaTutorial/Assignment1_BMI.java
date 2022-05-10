import java.util.Scanner;
public class Assignment1_BMI {
    public static void main(String[] args) {
           // BMI = weight (kg) / height (m^2)

           float BMI, weight, height, heightcm;
           Scanner sc = new Scanner(System.in);
           System.out.print("Input your weight(kg) : ");
           weight = sc.nextFloat();
           System.out.print("Input your height(cm) : ");
           heightcm = sc.nextFloat();
           height = heightcm/100;
           BMI = weight/(height*height);
   
           System.out.println("Your weight is "+weight+ " kg ");
           System.out.println("Your height is "+heightcm+ " cm ");
           System.out.println("Your BMI is "+BMI);
    }
    
}
