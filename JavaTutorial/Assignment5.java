import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        float BMI, weight, height, heightcm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your weight(kg) : ");
        weight = sc.nextFloat();
        System.out.print("Input your height(cm) : ");
        heightcm = sc.nextFloat();
        height = heightcm/100;
        BMI = weight/(height*height);

        String res ="";
        if(BMI>0 &&BMI<=18.0){
            res = "Your BMI = underweight";
        }else if(BMI>=18.5 &&BMI<= 22.9){
            res = "Your BMI = normal";
        }else if(BMI>=23.0 &&BMI<= 24.9){
            res = "Your BMI = overweight";
        }else if(BMI>=25.0 &&BMI<= 29.9){
            res = "Your BMI = obseity";
        }else if(BMI>=30 &&BMI<70){
            res = "Your BMI = extreme obesity";
        }else{
            res = "Your BMI = none";
        }
        System.out.println("Your weight is "+weight+ " kg ");
        System.out.println("Your height is "+heightcm+ " cm ");
        System.out.println("Your BMI is "+BMI);
        System.out.println(res);

        /*
            น้อยกว่า 18 = underweight
            18.5 - 22.9 = normal
            23.0 - 24.9 = overweight
            25.0 - 29.9 = obesity
            มากกว่า 30   = extreme obesity

        */
    }
}
