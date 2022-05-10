import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /*
         System.out.print("Input a number of month : ");
         int month = kb.nextInt();
         String name ="";
        */
         
        
        //การเขียนในโครงสร้าง if
       
        /*
        if(month ==1){
           name = "January";
            
        }else if(month ==2){
             name = "February";
            
        }else if(month ==4){
             name = "April";
        
        }else{
             name = "XXXX";

        } 
          System.out.println("This month is "+name);
        */


        //ตัวอย่าการใช้ switch(case) ในตัวแปรตัวเลขจำนวนเต็ม(integer)
        /*
        System.out.print("Input a number of month : ");
        int month = kb.nextInt();
        String name ="";
        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;    
            case 4:
                name = "April";
                break;
                
                

            default:
                name = "another month";
                break;
        }
        System.out.println("This month is " +name);
        */


        //การใช้ switch(case) ในตัวแปรข้อความ(string)
        String symptom;
        System.out.print
        ("1.headache\n2.stomachache\n3.stressed\nPlease input your symptom : "); 
        String panic = kb.nextLine();
        switch (panic) {
            case "headache":
                symptom = "take asprin";
                break;
            case "stomachache":
                symptom = "take ENO";
            case "stressed":
                symptom = "go to sleep";    
            default:
                symptom = " idk what to do";
                break;
        }
        System.out.println("The Solution is\nYou should "+symptom);
    }



}
