public class Method10Return {
    public static void main(String[] args) {
        //โปรแกรมหลัก    
        connectServer(200);

    }
    public static void connectServer(int ping){
        System.out.println("Ping : "+ping);
        if(ping>100){
            return; //คำสั่งให้หลุดออกจาก method 
            
        }
        System.out.println("Server Connected"); 
    }

}

 