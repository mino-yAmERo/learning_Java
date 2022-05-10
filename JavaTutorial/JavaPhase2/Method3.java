import java.util.Scanner;
public class Method3 {
    public static void main(String[] args) {
        //โปรแกรมหลัก
        int result = maxNumber(10,5);
        System.out.println("Max : "+result);
        int result2 = minNumber(10,5);
        System.out.println("Min : "+result2);
        int sum = summation(50, 100);
        System.out.println("Sum : "+sum);

    }
    /*
    ชนิดข้อมูลที่จะส่งออกไป ชื่อmethod (ค่าที่จะส่งเข้ามา){
        return ชนิดข้อมูล
    }
    */

    //method เปรียบเทียบตัวเลขสองตัว
    static int maxNumber(int a, int b){
        int max =0;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }
    //ลดรูป ไม่ต้องเก็บค่าในตัวแปร max
    /*
    static int maxNumber(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    */
    static int minNumber(int a , int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    static int summation(int x, int y){
        int total = x+y;
        return total;
    }

}
