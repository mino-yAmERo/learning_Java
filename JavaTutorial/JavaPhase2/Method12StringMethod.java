class Method12StringMethod {
    public static void main(String[] args) {
        String message = "Happy new year 2020 | Happy Birth Day 2020";
        //message.replace(target, replacement) 
        //replace เจอคำไหนให้เปลี่ยนหมด
        System.out.println("Before : "+message);
        message = message.replace("2020", "2021");
        System.out.println("After : "+message);
        //replace first เปลี่ยนแค่คำแรก คำเดียว
        message = message.replaceFirst("2021", "2020");
        System.out.println("Replace first : "+message);

        //การหั่น String 
        //เปลี่ยน String ให้เป็น array (ต้องใช้สัญลักษณ์ในการแบ่งข้อความในstring)
        String data = "Mango,Orange,Apple,Pineapple";
        String [] fruit = data.split(",");
        System.out.println("Fruits : "+fruit[3]);
        System.out.println(fruit.length);

        //หาข้อความย่อย (substring)
        String name ="Nutthabhas";
        //substring ระบุจุดเริ่มต้น (เหมือน index เริ่มนับตัวแรกที่เลข 0 (จุดสุดท้าย-1) )
        String a = name.substring(0,3); //เอา 0 1 2 
        System.out.println(a);
        String b = name.substring(6); //ถ้าไม่ระบุจุดสิ้นสุดจะได้มาตั้งแต่จุดที่เริ่มต้นจนสุด
        System.out.println(b);

        //แปลง string => char array
        char [] alphabet = name.toCharArray(); //แปลง string ให้เป็น array แบบ character
        System.out.println(alphabet[0]);

        //แปลง array char => string
        char [] abc = {'A','B','C'};
        String ABC = String.copyValueOf(abc);
        System.out.println(ABC);

        //การตัดช่องว่าง ตัดได้แค่ขอบนอกซ้าย-ขวา
        String name1 = "    Nutthabhas Thitabhas   ";
        System.out.println(name1);
        name1 = name1.trim();
        System.out.println(name1);

        //แปลงเป็นตัวพิมพ์เล็ก พิมพ์ใหญ่
        System.out.println("Upper Case : "+name1.toUpperCase());
        System.out.println("Lower Case : "+name1.toLowerCase());
    
        //แปลงตัวเลขเป็น String (valueOf)
        int huay = 237;
        double huayD = 0.2378;
        String huay1 = String.valueOf(huay);
        System.out.println(huay1);
        String huay2 = String.valueOf(huayD);
        System.out.println(huay2);
        
    }
}

