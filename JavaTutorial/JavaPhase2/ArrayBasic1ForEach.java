public class ArrayBasic1ForEach {
    public static void main(String[] args) {
        int []number = {10,20,30,40,50,60,70,80,90,100};
        String []fruits ={"Papaya", "Mango", "Watermelon"};

        for (String data : fruits) {
            System.out.println(data);
        }

        int sum=0, average;
        for (int num : number) {
            System.out.println(num);
            sum+=num;
            
        }
        average= sum/(number.length);
        System.out.println("avr : "+average);
        System.out.println("sum : "+sum);
    }
}
