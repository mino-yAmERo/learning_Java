import java.util.Scanner; //สามารถใช้ class Scanner อ่านข้อมูลจากไฟล์ได้ คล้าย BufferedReader
import java.io.File;
import java.io.PrintWriter;
class CalculateGrade {
    public static void main(String[] args) {
        //ต้องการเขียน ส่งออกไฟล์
        PrintWriter output =null; 

        try {
            Scanner scan = new Scanner(new File("Score.txt"));
            output = new PrintWriter(new File("Grade.txt"));
            String nisit="";
            String grade="";

            while(scan.hasNext()){//method เช็คว่ายังมีข้อมูลให้อ่านหรือไม่(อ่านทีละบรรทัด)
                //Loop อ่านข้อมูล
                
                nisit = scan.nextLine(); //อ่านข้อมูลทีละบรรทัดเก็บในตัวแปร nisit
                //System.out.println(nisit);
                int pos = nisit.indexOf(" "); //หาตำแหน่ง index ของช่องว่างใน nisit
                //System.out.println(pos);
                String scoreStr = nisit.substring(pos,nisit.length()); //หาข้อความตั้งแต่ index ช่องว่างจนจบประโยค
                //System.out.println(scoreStr);
                scoreStr = scoreStr.trim(); //ตัดช่องว่างใน String ออก => ได้คะแนนออกมาเป็น String
                double score = Double.parseDouble(scoreStr); //แปลง String => Double

                //Loop คำนวณเกรด
                if(score>=80){
                    grade = "A";
                }else if(score>=70 ){
                    grade = "B";
                }else if(score>=60 ){
                    grade = "C";
                }else if(score>=50 ){
                    grade = "D";
                }else{
                    grade = "F";
                }
                //System.out.println("Score : "+score+", Grade : "+grade); //แสดงผลหลังคำนวณเกรด
                
                //รูปแบบของข้อมูลที่ต้องการส่งออกไป
                System.out.println(nisit+"   "+grade);
                output.println(nisit+"   "+grade);
                
            }
        

        } catch(Exception e){
            e.printStackTrace();
        }
        output.close();
    }


}