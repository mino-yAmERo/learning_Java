public class Tutor_String {
    public static void main(String[] args) {
    /*
        String คือ ชนิดข้อมูลที่เก็บชุดข้อความ
        symbol = ""

        char เก็บตัวอักษร
        symbol = ''

        char เรียงต่อกัน => String
    
        */
        
        char a = 'A';
        System.out.println(a);    
        
        String b = "ABC123",c = "321CBA",e;
        System.out.println(b);
        System.out.println(c);

        String d = "100";
            {   
            d=d+50; //นำ string มาต่อกัน
            e=b+c;  //นำ string มาต่อกัน
            System.out.println(d);
            System.out.println(e);
            }
        //string => int 
        int f;
        String d1 ="100";
        f =Integer.parseInt(d1); // กำหนด class int .parseInt(string)
        f = f+100;
        System.out.println(f);

        // string => double
        double g;
        g =Double.parseDouble(d1);
        g = g+100;
        System.out.println(g);

        // int => string
        int num1 = 100;
        String age = String.valueOf(num1); 
        // คำสั่งที่ใช้เช็คว่าค่าที่จะนำมาเช็คนั้นเป็นตัวเลข และทำให้เป็น string
        
        System.out.println("age = " +age);
        
        kuy(1,2);
        

    }
    public static void kuy(int a, int b){
        System.out.println(a+b);
    }
}
