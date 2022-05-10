import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        //โปรแกรมคำนวณเลขคู่ เลขคี่
        Scanner kb = new Scanner(System.in);
        System.out.print("Input number = ");
        int num= kb.nextInt();

        String result ="";

            // if(num%2==0){
            //     result =num+ " = an even number";
            // }else{ 
            //     result =num+ " = an odd number";

            // }
            
            
            
            // Ternary Operator ลดรูป
            // ตัวแปร = (เงื่่อนไข) ? คำสั่งเมื่อเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
            result = num%2 == 0 ? num+ " = an even number" : num+ " = an odd number" ;



            System.out.println(result);
    }
}
