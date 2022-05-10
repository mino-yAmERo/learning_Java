public class Main {
 
    public static void main(String[] args) {
        //การสร้าง Object 
        /*
        Employee e1 = new Employee(); //Create Object
        Employee e2 = new Employee(); //Create Object 
        */

        // การใช้ method setter getter
        /*
        Employee e1 = new Employee(); สร้าง object
        e1.setID("1");
        e1.setName("Mino");
        e1.setSalary(30000.0);
        e1.disPlayEmployee(); method แสดง id name salary
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        Employee e2 = new Employee(); สร้าง object
        e2.setID("2");
        e2.setName("Minor");
        e2.setSalary(50000.0); 
        e2.disPlayEmployee(); method แสดง id name salary
        System.out.println(""+e2.getName());
        */



        //การใช้ Default Constructor และ Constructor 

        /*
        Employee e1= new Employee("1", "Mino", 30000);
        e1.disPlayEmployee();
        Employee e2= new Employee(); 
        e2.disPlayEmployee();
        Employee e3= new Employee("3","Minor");
        e3.disPlayEmployee();
        */

        
        //Static Attribute & Static Method
        //Static Attribute ไม่ต้องสร้าง Object ขึ้นมาก่อน
        /*

        int result= Employee.minSalary; เก็บไว้ในตัวแปร result
        System.out.println(result);
                    หรือ
        System.out.println(Employee.minSalary); ไม่ต้องเก็บในตัวแปร
        
        สร้าง file ใหม่ (ข้อมูลบริษัท => Company.java)
        ใช้ static ตอนที่มีการโยนข้อมูลข้ามหน้า
        
        //Static Attribute อยู่ใน class company
        System.out.println("Company name : "+Company.NAME);
        System.out.println("Create at : "+Company.CREATE);
        //Static method อยู่ใน class company
        Company.service(); 
        */
        
        //Inheritance การสืบทอดคุณสมบัติ
        //superclass -> subclass
        //Employee -> Programmer
        //Employee -> Accountting
        //Extend สืบทอดคุณสมบัติจาก class แม่

        /*
            Programmer p1= new Programmer("Mino",20000);
            // setter method
            p1.setName("Programmer");
            p1.setSalary(20000);
            p1.disPlayEmployee(); 

            Accounting ac1 = new Accounting("Minor",25000);
            //setter method
            ac1.setName("Minoto");
            ac1.setSalary(25000);
            ac1.disPlayEmployee(); 
            System.out.println(Company.NAME);
        */

        //Overloading
        /*
        Programmer e1= new Programmer();
        e1.skill("java","C#","Python");
        Programmer e2= new Programmer();
        e2.skill();
        Programmer e3= new Programmer();
        e3.skill("Java","C#","Python","NodeJS");  
        */
        
        //Overridding
        Programmer e1 = new Programmer(); //สร้าง object
        e1.bonus();
        Accounting ac1 = new Accounting(); //สร้าง object
        ac1.bonus();
        
        

        

        

        
    }
}
