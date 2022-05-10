import java.util.Scanner;

public class InputnextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = sc.nextLine(); 
        //next() รับค่าจากแป้นพิมพ์ แต่ไม่อ่านข้อความหลังจากช่องว่าง (" ")
        //nextLine() อ่านข้อความที่รับจากแป้นพิมพ์ทั้งบรรทัด 
        System.out.println("Your name is "+name);



    }
}
