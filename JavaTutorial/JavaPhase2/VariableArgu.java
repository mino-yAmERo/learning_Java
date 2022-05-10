public class VariableArgu {
    public static void main(String[] args) {
        //โปรแกรมหลัก
        summation(10, 20, 30, 40, 50,60, 70, 80);

    }
    static void summation(int a, int b){
        int sum= a+b;
        System.out.println("Summation = "+sum);
    }
    static void summation(int a, int b, int c){
        int sum= a+b;
        System.out.println("Summation = "+sum);
    }

    public static void summation(int...number){
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+= number[i];
        }
        System.out.println("Summation = "+sum);    
    }


}




