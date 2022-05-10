public class Method9 {
    public static void main(String[] args) {
    int [] numberA = {10,20,30,40,50,100,200};
    int [] numberB = copyArray(numberA);
    Method4.displayArray2(numberA); //อ้างอิง method จาก class method4
    Method4.displayArray2(numberB); //อ้างอิง method จาก class method4
    
    System.out.println(searchElement(numberA, 100));
    String [] Fruits = {"Orange","Papaya","Mango"};
    System.out.println(searchFruit(Fruits, "Rose"));
    }

    static int [] copyArray(int [] a){
        int []newarray =new int[a.length];
        for (int i=0;i<a.length;i++){
            newarray[i]=a[i];
        }
        return newarray;
    }

    static int searchElement( int [] arr, int num){ 
        //method ค้นหาสมาชิกใน array
        //scope ของ method = ค้นตัวเลขค่าบวก
        for (int i=0 ; i<arr.length; i++){
            if(arr[i] == num){
                return i; //หาเจอ return เลข index นั้นออกไป
            }
        }
        return -1; //ค้นหาไม่เจอคืนค่า -1

    }

    static int searchFruit( String []arr, String name){
        for( int i=0 ; i<arr.length;i++){
            if(arr[i].equals(name)){
                return i;
            }
        
        }
        return -1;
    }
}
