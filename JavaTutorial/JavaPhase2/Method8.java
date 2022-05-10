public class Method8 {
    public static void main(String[] args) {
        
        int [] numberA ={10,20,30,50,100,200};

        System.out.println("Before swap ");
        Method4.displayArray(numberA);
        swapElement(numberA, 2, 5);
        System.out.println("After swap ");
        Method4.displayArray(numberA);
    }

    static void swapElement(int []a , int x , int y){
        //สลับค่าใน array
        //x ตำแหน่งเริ่มต้น , y ตำแหน่งปลายทาง
        // 10 20 30 50 100 200
        // 0  1  2  3  4   5
        // จัดเก็บตำแหน่งชั่วคราว
        //a[x] => a[y]
        int temp = a[x]; //เก็บค่าเริ่มต้นไว้ชั่วคราว
        a[x] = a[y]; //สลับค่าเริ่มต้นเป็นค่าที่ต้องการสลับ
        a[y] = temp; //ค่าที่โดนสลับกลายเป็นค่าเริ่มต้น



    }
}
