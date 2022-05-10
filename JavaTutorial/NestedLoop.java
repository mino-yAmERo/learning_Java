public class NestedLoop {
    public static void main(String[] args) {
        //Loop ซ้อน Loop
        
        //โครงสร้าง for
        /*
        // loop นอก
        for(int i=1;i<=3;i++){
            System.out.println("i : "+i);
            // loop นอก
            for(int j=1;j<=5;j++){
                System.out.println(i+"."+j);
            }
        }

        */
        //โครงสร้าง while
        int i=1,j=1;
        while(i<=3){
            System.out.println("i : "+i);
            j=1;
            while(j<=5){
                System.out.println(i+"."+j);
                j++;
            }
            i++;
        }
        


    }
}
