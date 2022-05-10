import java.util.Scanner;
public class Method2 {
    public static void main(String[] args) {
    //โปรแกรมหลัก
    //String myIP = getIP();
    //System.out.println("IP Address : "+myIP);

    Scanner scan = new Scanner(System.in);
    System.out.print("Please insert your salary : ");
    double salary = scan.nextDouble();
    double bonus = getBonus();
    salary += bonus;
    System.out.println("Your salary (including bonus) is = "+salary);
    System.out.println("Address : "+getMycity());

    }

    // modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ชื่อmethod(){}    
    // static void ip(){} //กำหนดเป็น void คือไม่มีการส่งค่าใดๆกลับมายังโปรแกรมหลัก 
    static String getIP(){
        return "127.0.0.1";
    }
    static double getBonus(){
        return 1000.0;
    }
    static String getMycity(){
        String city = "Sakaeo";
        return city;
    }
}
