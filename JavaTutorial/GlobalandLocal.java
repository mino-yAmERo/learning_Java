public class GlobalandLocal {
    public static void main(String[] args) {
        //Global variable
        int a=100;
        int b=200;
        System.out.println(a);
        
        {
            int c=300; 
        //Local variable ตัวแปรที่อยู่ในส่วนเฉพาะ สามารถทำงานได้แค่ใน {} นั้นๆ
            System.out.println("A = " +a);
        //สามารถปริ้นตัวแปร a ได้ เนื่องจากเป็น global variable 
        }
        
        System.out.println("B = " +b);
        // System.out.println(c);
        // ไม่สามารถปริ้นตัวแปร c ได้ เนื่องจากเป็น local variable
    }
}
