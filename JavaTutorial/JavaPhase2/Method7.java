public class Method7 {
    public static void main(String[] args) {
        
    
    int []numberA = {10,10,30,40,50,-50,100};
    int []numberB = {10,10,30,40,50,-50};
    System.out.println("Comparation of number A and number B :"+compareArray(numberA, numberB));


    }

    static boolean compareArray (int [] a, int [] b){ //เทียบค่าทุกตัว 
        //scope ของmethod : ขนาดของ array ต้องเท่ากัน
        if (a.length != b.length) return false;
        for (int i=0;i<a.length;i++){
            if(a[i] != b[i]){ //เทียบค่า
                return false; 
            }
        }
        return true;
    }


}
