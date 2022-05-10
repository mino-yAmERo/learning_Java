class Method4 {
    public static void main(String[] args) {
    //โปรแกรมหลัก
    //ทบทวน Array
    /*
    int []numberA = {10,20,30,40,50};

    for (int i=0;i<numberA.length;i++){
        System.out.println("number A Index "+i+" : "+numberA[i]);
    }

    int []numberB = {20,40,60,80,100};
    for (int i=0;i<numberB.length;i++){
        System.out.println("number B Index "+i+" : "+numberB[i]);
    }
    */
    int []numberA = {10,20,30,40,50};
    int []numberB = {20,40,60,80,100};
    double []numberC = {100.55, 154.68,156.33,157.69};
    displayArray(numberA);
    displayArray2(numberB);
    displayArrayD(numberC);
}
    //method แสดงผลตัวเลข (int) ใน array ที่ส่งเข้ามาทำงาน
    static void displayArray(int [] num){
        for (int i=0;i<num.length;i++){
            System.out.println("Index "+i+" : "+num[i]);
        }
        System.out.println("##############");
    }
    static void displayArray2(int [] num){
        System.out.print("{");
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]);

            if(i<num.length-1) System.out.print(",");
            
        }
        System.out.println("}");
        System.out.println("##############");
    }
    static void displayArrayD(double [] num){
        System.out.print("{");
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]);

            if(i<num.length-1) System.out.print(",");
            
        }
        System.out.println("}");
        System.out.println("##############");


    }
}

 