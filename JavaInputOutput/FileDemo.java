import java.io.*;
public class FileDemo {
    //การเขียนไฟล์
    public static void main(String[] args) {

    //File f = new File("C:\Program\Demo.txt"); //กำหนดตำแหน่งไฟล์ที่ต้องการเขียนขึ้น หรืออ่าน
    //File f = new File("Demo.txt");
    try {
        FileWriter writer = new FileWriter(new File("Introduction.txt")); //สร้างไฟล์
        BufferedWriter bfw = new BufferedWriter(writer);
        // writer.write("Hello World"); //เขียนลงไปในไฟล์
        // writer.write("How are u?");
        //writer.close(); //ปิดไฟล์
        bfw.write("Hello World\n");
        bfw.write("How are you today ?\n");
        bfw.write("I want you");
        bfw.close();
        
        System.out.println("Writting done!");
    } catch (Exception e) {
        e.printStackTrace();
    }


    }
}
