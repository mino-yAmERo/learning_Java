public class Method1 {
    public static void main(String[] args) {
        //โปรแกรมหลัก
        display("Hello Mino"); // "Hello Mino" => argument
        display("Mino");
        fullname("Nutthabhas","Thitabhas"); 
        //Nutthabhas => Argument1
        //Thitabhas=> Argument2
        plus(23,78);
        subtract(50, 20, 18);
    }

    //การสร้าง method ที่ไม่มีการรับค่า
    /*
    static void display(){
        System.out.println();
    }
    */

    //การสร้าง method รับค่า 1ค่า
    static void display(String message){ //message => parameter
        System.out.println(message);
    }
     //การสร้าง method รับค่า 2ค่า
    static void fullname(String firstname, String lastname){ 
        //firstname => parameter1
        //lastname => parameter2
        System.out.println("Firstname : "+firstname);
        System.out.println("Lastname : "+lastname);
    }
    static void plus(int a, int b){
        int c = a+b;
        System.out.println(a+" + "+b+" = "+c);
    }
     //การสร้าง method รับค่า 3ค่า
    static void subtract(int x, int y, int z){
        int c = x-y-z;
        System.out.println(x+" - "+y+" - "+z+" = "+c);
    }

    
    
}
