import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
   
    /* 
    โปรแกรมแลกธนบัตร
    ประกอบด้วย => 1000, 500, 100, 50, 20

    เช่น 
    2000 จะได้
    แบงค์ 1000 2ใบ
    -------------------------
    1500 จะได้
    แบงค์ 1000 1ใบ
    แบงค์ 500 1ใบ
    -------------------------
    1800 จะได้
    แบงค์ 1000 1 ใบ
    แบงค์ 500 1ใบ
    แบงค์ 100 3ใบ
    -------------------------
    100 จะได้
    แบงค์ 100 1ใบ
    -------------------------
    90 จะได้
    แบงค์ 50 1ใบ
    แบงค์ 20 2ใบ
    -------------------------
    70 จะได้
    แบงค์ 50 1ใบ
    แบงค์ 20 1ใบ
    -------------------------
    */
        Scanner kb = new Scanner(System.in);
        System.out.print("Input cash = ");
        int cash= kb.nextInt();
        System.out.println("Your cash is "+cash);
        
        if(cash>=1000){
            //5000/1000 = จำนวนแบงค์พัน
            System.out.println("You will get "+(cash/1000)+" 1000-baht note");
            cash=cash%1000;
            
        }
        if(cash>=500){    
            System.out.println("You will get "+(cash/500)+" 500-baht note");
            cash=cash%500;
            
        }
        if(cash>=100){    
            System.out.println("You will get "+(cash/100)+" 100-baht note");
            cash=cash%100;
            
        }
        if(cash>=50){    
            System.out.println("You will get "+(cash/50)+" 50-baht note");
            cash=cash%50;
        }    
        if(cash>=20){    
            System.out.println("You will get "+(cash/20)+" 20-baht note");
            cash=cash%20;
        }
        if (cash!=0){
            float cashf = cash;
            System.out.println("Your balance is = "+cashf);
        }else{
            System.out.println("That's all");
        }

    }
}
