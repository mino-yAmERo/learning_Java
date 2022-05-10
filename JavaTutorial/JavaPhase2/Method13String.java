public class Method13String {
    public static void main(String[] args) {
        String name ="Mi no";
        String name2 = "Mi No";
        String city = new String("Sakaeo"); //สร้าง object class string

        System.out.println(name);
        System.out.println(city);

        //Concatenation => ต่อ string
        System.out.println(name+city);
        String result = name+city+".com";
        System.out.println(result.concat(".com"));

        //หาความยาว string => .length (รวมพื้นที่ว่าง(space))
        System.out.println("name's length : "+name.length()); //ส่งค่ากลับมาเป็น int
        int count = city.length();

        //หาตำแหน่งตัวอักษร charAt (เลขตำแหน่ง index)
        System.out.println("CharAt : "+name.charAt(1));

        //เปรียบเทียบ String (.equals)
        boolean res = name.equals(name2); //ส่งค่ากลับมาเป็น true|false
        if(res){
        System.out.println("true");
        }else{
            System.out.println("false");
        }
        //เปรียบเทียบ String โดยไม่คิดตัวพิมพ์เล็ก พิมพ์ใหญ่ (.equalsIgnoreCase)
        boolean res1 = name.equalsIgnoreCase(name2); //ส่งค่ากลับมาเป็น true|false
        if(res1){
        System.out.println("true");
        }else{
            System.out.println("false");
        }

        //ใช้คำสั่งตรวจสอบคำเริ่มต้นและคำสุดท้าย //ส่งค่ากลับมาเป็น true|false
        String fullname = "Mr.Nutthabhas Thitabhas";
        boolean start = fullname.startsWith("Mr.");
        System.out.println("Start with Mr.? :"+start);
        if(start){
            System.out.println(fullname+" is male");
        }else{
            System.out.println(fullname+" is female");
        }

        String code= "ADA378TH";
        if(code.endsWith("TH")){
            System.out.println("delivered from Thailand");
        }else{
            System.out.println("delivered from another country");
        }

        //หาตำแหน่ง index ของคำ
        System.out.println(code.indexOf(" ")); 
        //ถ้าพบจะส่งเลข indexกลับมา 
        //แต่ถ้าไม่พบ จะส่งค่า -1 กลับมา


    }
}
