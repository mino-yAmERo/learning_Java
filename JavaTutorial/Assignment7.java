import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        //โปรแกรมแปลงอุณหภูมิ
        Scanner kb = new Scanner(System.in);
        System.out.print("Please input 1st temperature in Farenheit : ");
        float temp=kb.nextFloat();
        System.out.print("Please input 2nd temperature in Celcius : ");
        float temp2=kb.nextFloat();

        float cel= (temp-32)*5/9;
        System.out.println("1st Temperature in Farenheit = "+temp+" F ");
        System.out.println("1st Temperature in Celcius = "+cel+ " C ");

        float faren= (temp2*9/5)+32;
        System.out.println("2nd Temperature in Celcius = "+temp2+" C ");
        System.out.println("2nd Temperature in Farenheit = "+faren+ " F ");


        
    }
}
