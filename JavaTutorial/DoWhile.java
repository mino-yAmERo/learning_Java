public class DoWhile { 
    public static void main(String[] args) {
    //Do..while
    //ลองทำก่อน1รอบ ถ้าเป็นจริงกลับไปทำซ้ำใหม่
    int count=0;
    do{
        //คำสั่งที่จะให้ทำซ้ำ
        System.out.println("round : "+count);
        count++;
    }while(count<5);

    }
}
