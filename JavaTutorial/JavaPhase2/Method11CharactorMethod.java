public class Method11CharactorMethod {
    public static void main(String[] args) {
        /*
        //การสร้างตัวแปรและ array เก็บ char
        char alphabet ='A';
        char []group = {'A','B','C'};
        System.out.println(alphabet);
        System.out.println(group);
        */

        // Character alphabet = new Character('A'); //การสร้าง object character เลิกใช้ตั้งแต่เวอร์ชั่น9
        //System.out.println(alphabet);
        char alphabet ='A';
        char a = 'a';
        char one ='1';
        char []group = {'A','B','C'};
        System.out.println(Character.isLetter(alphabet)); //เช็คว่าเป็นตัวอักษร หรือไม่ true or false
        System.out.println(Character.isDigit(alphabet)); //เช็คว่าเป็นตัวอักษรแบบตัวเลขหรือไม่
        System.out.println(Character.isDigit(one));
        if(Character.isUpperCase(alphabet)){ //เช็คว่าเป็นตัวพิมพ์ใหญ่หรือไม่
            System.out.println(alphabet+" is Upper Case");
        }else{
            System.out.println(alphabet+" is Lower Case");
        }

        if(Character.isLowerCase(a)){ //เช็คว่าเป็นตัวพิมพ์เล็กหรือไม่
            System.out.println(a+" is Lower Case");
        }else{
            System.out.println(a+" is Upper Case");
        }
        System.out.println("Before = "+a);
        char b = Character.toUpperCase(a);
        System.out.println("After = "+b);
        char c = Character.toLowerCase(alphabet);
        System.out.println(alphabet+" => "+c);

    }
}
