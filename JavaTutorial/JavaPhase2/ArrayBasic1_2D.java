public class ArrayBasic1_2D {
    public static void main(String[] args) {
        String [][]products = {
            {"Chairs","Table","Lamp"},
            {"Keyboard","Mouse","Headset"},
            {"Soap","Shampoo","Roll-on"}
        }; 
        // products [เลขแถว][เลขคอลัมน์]
        System.out.println("Before : "+products[2][2]);

        //เปลี่ยนสมาชิก
        products[2][2] = "Pencil";
        System.out.println("After : "+products[2][2]);
    }

}
