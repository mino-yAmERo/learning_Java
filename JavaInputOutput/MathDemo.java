import java.lang.Math;
public class MathDemo {
    public static void main(String[] args) {
        //ค่าคงที่ใน ClassMath;
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //หาพื้นที่วงกลม 
        /*
        int r=2;
        double area =Math.PI*r *r;
        System.out.println(area);
        */

        //ค่าสัมบูรณ์ เลขที่ไม่มีเครื่องหมายติดลบ
        int num = -30;
        System.out.println("abs : "+Math.abs(num));

        //ปัดเศษ ปัดขึ้น|ปัดลง|ปัดขึ้น-ลง ตามเกณฑ์
        double number = 14.51;
        System.out.println(Math.ceil(number)); //ปัดขึ้น
        System.out.println(Math.floor(number)); //ปัดลง

        //ปัดตามเกณฑ์ 
        //<= .5 ปัดลง | > .5 ปัดขึ้น
        System.out.println(Math.rint(number));

        //ปัดตามเกณฑ์อีกหนึ่งกรณี
        //<= .4 ปัดลง | >= .5 ปัดขึ้น
        
        System.out.println(Math.round(15.4)); //ได้ค่ากลับมาเป็น int
        System.out.println(Math.round(15.5));
        System.out.println(Math.round(15.6));

        // หาค่ารากที่ 2
        System.out.println("Sqrt of 9 = "+Math.sqrt(9));
        System.out.println("Sqrt of 25 = "+Math.sqrt(25));

        //หาค่ายกกำลัง
        //5*5*5
        System.out.println("5 pow 3 (5*5*5) = "+(5*5*5));
        System.out.println("5 pow 3 (5*5*5) = "+Math.pow(5, 3)); //5 ยกกำลัง3

    }


}
