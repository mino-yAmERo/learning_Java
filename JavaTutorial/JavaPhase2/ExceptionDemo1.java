import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        /*
        int a = 10 , b = 1;
        int c = a/b;
        System.out.println(c);
        //ArithmeticException : divided by zero หาร0 = exception ทางคณิตศาสตร์

        int [] item = {10,20,30};
        System.out.println(item[5]); 
        ArrayIndexException : Index 5 out of bounds for length 3
        //เกินขอบเขตของ array

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert a number : ");
        int num = scan.nextInt(); //ใส่อย่างอื่นที่ไม่ใช่ตัวเลข
        System.out.println(num);
        //InputMismatchException
        */

        try {
            
            int a = 10 , b = 2;
            int c = a/b;
            System.out.println(c);

            int [] item = {10,20,30};
            System.out.println(item[2]); 
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Insert a number : ");
            int num = scan.nextInt();
            System.out.println(num);
            
            
        }catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index isn't correct");
        }catch (InputMismatchException e){
            System.out.println("Please only input an integer");
            e.printStackTrace(); //คำสั่งแสดง Exception แต่โปรแกรมยังทำงานได้ 
        }finally{
            //คำสั่งอื่นๆ
            System.out.println("Do whatever u want");
        }


    }


}
