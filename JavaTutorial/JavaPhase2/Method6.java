public class Method6 {
    public static void main(String[] args) {
        
    
    //ค้นหาตำแหน่งของ array ที่มีค่าสูงสุด
    int []numberA = {10,20,30,50,-40};
    int []numberB = {0,200,-30,80,125};
    
    System.out.println("Max value in number A : "+Method5.maxvalueinarray(numberA));
    System.out.println("Max value in number B : "+Method5.maxvalueinarray(numberB));
    System.out.println("Max Index in numberA : "+findMaxIndex(numberA));
    System.out.println("Max Index in numberB : "+findMaxIndex(numberB));
    System.out.println("Min value in number A : "+Method5.minvalueinarray(numberA));
    System.out.println("Min value in number B : "+Method5.minvalueinarray(numberB));
    System.out.println("Min Index in numberA : "+findMinIndex(numberA));
    System.out.println("Min Index in numberB : "+findMinIndex(numberB));
}

static int findMaxIndex(int [] num){
    int maxIndex =0; //เก็บตำแหน่ง index สมาชิกที่มีค่ามากที่สุดใน array
    for (int i=0;i<num.length;i++){
        if(num[i]>num[maxIndex]) maxIndex=i;
    }
    return maxIndex;
    }
static int findMinIndex(int [] num){
    int minIndex =0;
    for (int i=0;i<num.length;i++){
        if(num[i]<num[minIndex]) minIndex=i;
    }
    return minIndex;
    }


}

