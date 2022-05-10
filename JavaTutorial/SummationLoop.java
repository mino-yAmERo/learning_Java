import java.util.Scanner;
public class SummationLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //1,2,3,4,5
        int sum=0, count=0;
        while (true) {
            System.out.print("Input your number (if negative -> close program): " );
            int num=kb.nextInt();
            if(num<0) break;
            count++;
            sum+=num;

            
        }
        System.out.println("Sum : "+sum); 
        //sum= num1+num2+..+numN
        System.out.println("Number of Input number : "+count);
        System.out.println("Average : "+(sum/count));
        //average = (num1+num2+...+numN)/N
    }

}
