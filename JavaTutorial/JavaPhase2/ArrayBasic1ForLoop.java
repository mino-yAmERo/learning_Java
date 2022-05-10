public class ArrayBasic1ForLoop {
    public static void main(String[] args) {
        int []number = {10,20,30,40,50,60,70,80,90,100};
        int count = number.length; //10

        for(int i=0;i<count;i++){
            System.out.println("Index "+i+" : "+number[i]);
        }
    }
}
