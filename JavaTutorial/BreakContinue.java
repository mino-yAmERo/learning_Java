public class BreakContinue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
           // if(i==5) break; //หลุดออกจากลูป ไปทำคำสั่งข้างนอก
           
           if(i==5) continue; 
           //เมื่อ i=5 จะวนกลับไปทำงานลูปต่อ แต่ไม่ทำคำสั่งอื่นๆต่อจากนี้

            System.out.println(i);
        }
        System.out.println("Hello World");
    }
}
