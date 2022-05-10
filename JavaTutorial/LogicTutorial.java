public class LogicTutorial {
    public static void main(String[] args) {
        System.out.println();
        /*
            AND && => และ
            OR || => หรือ
            NOT ! => ไม่ (ตรงกันข้าม)        
        */  
        int a=10, b=20;

        boolean c = (a==b); //false 10ไม่เท่ากับ20
        boolean d = (a<b);  //true  10น้อยกว่า20
        System.out.println(c&&d); // (a==b && a<b)
        System.out.println(c||d); // (a==b || a<b)

        System.out.println(!c&&d); //( !(a==b) && a<b)
        System.out.println(c||!d); //( (a==b) || !(a<b))

        System.out.println();
    }
}
