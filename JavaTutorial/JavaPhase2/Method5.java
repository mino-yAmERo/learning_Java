public class Method5 {
    public static void main(String[] args) {
    int []numberA = {10,20,30,40,50};
    int []numberB = {0,200,-30,80,125};

    int max = maxvalueinarray(numberA);
    System.out.println("Maximum value in []numberA : "+max);
    int max2 = maxvalueinarray(numberB);
    System.out.println("Maximum value in []numberB : "+max2);
    
    //ไม่ต้องเก็บค่าในตัวแปร
    System.out.println("Minimum value in []numberA : "+minvalueinarray(numberA)); 
    System.out.println("Minimum value in []numberA : "+minvalueinarray(numberB));

    
    Method4.displayArray(numberA); //ใช้ method จาก class Method4.java
    Method4.displayArray(numberB); //ใช้ method จาก class Method4.java

    }

    //method หาค่าสูงสุดใน array ละส่งค่ากลับมา
    static int maxvalueinarray(int [] num){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            
            if(num[i]>max) max=num[i];
        }
        return max;
    }
    
    static int minvalueinarray(int[] num){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            
            if(num[i]<min) min=num[i];

        }
        return min;
    }
}
