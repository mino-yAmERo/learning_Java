public class WhileLoop {
    public static void main(String[] args) {
        int count=1;
        // while (true) เป็นจริงเสมอ ไม่รู้รอบที่ชัดเจนใช้ while(true)
        // while(count<=10)
        while (true) {
            System.out.println("count : "+count+ "\nHello World");
            count++;
            
            if(count==1000) break; // break หลุดออกจาก while loop 
            
        }

    }
}
