import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {
        //รับค่าข้อมูล
        //ข้อมูลแบบไหน ? int, float, long, short, string
        //ข้อความทำอะไรMin
        //ข้อความแบบตัวเลข คำนวณ | คำนวณไม่ได้

        //ประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine(); // รับค่า String จากแป้นพิมพ์ => name

        System.out.print("Your year or birth = ");
        int year = sc.nextInt(); // รับค่า integer จากแป้นพิมพ์ => year
        int age = 2564-year; //คำนวณอายุ

        // เก็บค่าเป็นทศนิยม
        // float year = sc.nextFloat(); 
        // float age = 2564-year; 


        System.out.println("Your name is "+name); //แสดงข้อความที่พิมพ์
        System.out.println("Your year of birth is "+year);
        System.out.println("Your age is "+age); 

        


    }
}