import java.util.Scanner;
class ThrowDemo {
    static int balance = 5000;

    public static void main(String[] args) {
        /*
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input a number : ");
            int num = scan.nextInt();
            
            if(num<0){
                throw new Exception("You have to put a positive integer");
            }
            System.out.println(num);
            
        } catch (Exception e) {
            e.printStackTrace();

        }*/


        //โปรแกรมถอนเงิน
        //บัญชีเงินฝาก 5000
         try {
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Input a withdrawal number : ");
            int money = scan.nextInt();
            //ถอนเงิน
            withDraw(money);
            
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    //Exception ใน Method ด้วย Throws
    //ต้องประกาศว่า method นี้จะมีการนำ exception ส่งมา
    public static void withDraw(int amount) throws Exception {
        if(amount<=0){
            throw new Exception("You have to put more than zero.");
        }
        if(amount>balance){
            throw new Exception("Your balance is not enough to make a withdraw.");
        }
        balance-=amount;
            System.out.println("Your withdraw is "+amount+" baht.");
            System.out.println("Your balance is "+balance+" baht.");
    }

}
