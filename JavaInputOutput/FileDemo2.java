import java.io.*;
public class FileDemo2 {
    //การอ่านไฟล์
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(new File ("Introduction.txt")); 
            //Filereader อ่านข้อมูลเก็บข้อมูลในรูปแบบ int
            BufferedReader bfr = new BufferedReader(reader);
            //Bufferedreader อ่านข้อมูลทีละบรรทัดเก็บข้อมูลในรูปแบบ string
            String message="";

            /*
            int data; //สร้างตัวแปรเพื่อเก็บค่า unicode หรือตัวอักษรที่อ่านมาจากตัว reader
            while((data = reader.read()) !=-1){
                //System.out.println(data); //ข้อมูลที่อ่านได้เป็นตัวเลข
                System.out.printf("%c\n",data); //แปลงข้อมูลตัวเลขให้แสดงเป็น char(%c) 
            }*/
            while((message= bfr.readLine()) !=null){ //null = จนกว่าจะว่างเปล่าหรือไม่เจอข้อมูล
                System.out.println(message);
            }


            

        } catch (FileNotFoundException e){
            System.out.println("File not found ");
        } catch (Exception e){
            e.printStackTrace();

        } 
        
    }
}

