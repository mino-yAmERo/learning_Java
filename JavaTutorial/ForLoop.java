import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // โครงสร้างคำสั่ง for loop
        /*
        
        for(ค่าเริ่มต้นของตัวแปร;เงื่อนไข;เปลี่ยนแปลงค่าตัวแปร){
            คำสั่งเมื่อเงื่อนไขเป็นจริง
        }


        */

        //3ส่วน
        //1.ตัวแปรเริ่มต้น
        //2.เงื่อนไข
        //3.เพิ่มค่า / ลดค่า
        
        

        for(int i=1;i<=10;i++){ // เพิ่มทีละ 2 => i+=2 หรือ i=i+2
            //คำสั่งที่ทำซ้ำเมื่อเงื่อนไขเป็นจริงแล้วค่อยทำการเพิ่มค่าหรือลดค่า
            System.out.println(i);

        }
        

        
        
    }
}
