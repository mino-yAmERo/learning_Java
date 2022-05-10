public class TypeCasting {
    public static void main(String[] args) {
        //แปลงจากหน่วยเล็กไปใหญ่
        //ใช้คำสั่งได้เลย เช่น แปลงจาก int เป็น double เก็บในตัวแปร numDouble
        //double numDouble=numInt;
        int numInt=10;
        double numDouble=numInt;
        System.out.println("Int -> Double");
        System.out.println(numInt);
        System.out.println(numDouble);
        System.out.println();

        //แปลงจากหน่วยใหญ่ไปเล็ก 
        //ต้องใช้วงเล็บ ->(int) เช่น แปลง double เป็น int
        //นำค่าที่อยู่ใน numDouble1 มาทำให้เป็น int แล้วเก็บในตัวแปร numInt1
        // int numInt1=(int)numDouble1;
        double numDouble1 = 10.0;
        int numInt1=(int)numDouble1; 
        System.out.println("Double -> Int");
        System.out.println(numInt1);
        System.out.println(numDouble1);
    }
    
}
