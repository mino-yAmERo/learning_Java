public class ArrayBasic1 {
    public static void main(String[] args) {
        // การสร้าง array

        // แบบกำหนดขนาด
        // int[]number = new int[4];
        // กำหนดค่าลงไป
        // number[0] = 10;
        // number[1] = 20;
        // number[2] = 30;
        // number[3] = 40;
        
        
        //แบบกำหนดสมาชิก
        int []number ={10,20,30,40,50,70,100,150,300,200,142,354};
        boolean []status={true,false,true,false};
        String []fruits ={"Papaya", "Mango", "Watermelon"};
        
        System.out.println("bef Index 5 : "+number[5]);
        number[5] = 100; //เปลี่ยนค่าสมาชิกใน array
        System.out.println("aft Index 5 : "+number[5]);
        int size =number.length;
        System.out.println("Number of index : "+size);
        System.out.println(fruits[2]);

    }
}
