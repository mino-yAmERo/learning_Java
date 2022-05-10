public class CheckType {
    public static void main(String[] args) {
        //เช็คชนิดข้อมูล    //ชื่อ class
        Integer a = 1;          //Integer
        boolean b;      //Boolean
        Character c;         //Character
        Double d;       //Double
        String e = "Hello";
        Float f;        //Float 

        //เช็คว่า เป็น (true) or ไม่เป็น (false)
        boolean result= e instanceof String; 
        // instanceof เป็นคำสั่งที่เช็คว่าตัวแปร e เป็น object ที่สร้างจาก string ไหม
        // instanceof เป็นคำสั่งที่ใช้กับ class 
        // เลยต้องเปลี่ยนการกำหนดตัวแปรเป็นอ้างอิงจาก class
        // เช่น int a => Integer a , char c => Character c 

        
        System.out.println(result);
        // string => true
        // string => false 

        boolean result1 = a.toString() instanceof String;
        System.out.println(result1 );

        boolean result2 = a instanceof Integer;
        System.out.println(result2);


    }
    
}
