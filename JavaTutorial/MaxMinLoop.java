import java.util.Scanner;
public class MaxMinLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int maxNumber=Integer.MIN_VALUE , minNumber=Integer.MAX_VALUE;
        while(true){
            System.out.println();
            System.out.print("Input your number (input zero  -> close program) : ");
            int number = kb.nextInt();
            if(number==0)break;

            if(number>maxNumber) maxNumber=number;
            if(number<minNumber) minNumber=number;
            if(number%2==0){
                System.out.println(number+" is an even number");
            }else{   
                System.out.println(number+ " is an odd number"); 
            
            }
            
        }
        System.out.println();
        System.out.println("Max number : "+maxNumber);
        System.out.println("Min number : "+minNumber);
        System.out.println();
    }
}
