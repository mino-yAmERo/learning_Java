abstract class Employee {
    // Attribute
    private String id;
    private String name;
    private double salary;
    // Static Attribute
    static int minSalary=12000;
    
    //Default Constructor
    /*
    public Employee() {
        this.id="1"; //กำหนดค่าเริ่มต้น
        this.name="Mino"; //กำหนดค่าเริ่มต้น
        this.salary=30000; //กำหนดค่าเริ่มต้น 
        System.out.println("Create Object Complete");
    }
    */
    //Default Constructor
    public Employee(){
        System.out.println("(Default Constructor)");
        System.out.println("I'm Employee at Mino Industry");
    }
    
    //Constructor
    public Employee(String name,double salary){
        System.out.println("I'm Employee at Mino Industry");
        this.name =name;
        this.salary=salary;
        disPlayEmployee();
    }

    

    //Method
    public void setID(String id){ //setter
        this.id=id;
    }
    public void setName(String name){ //setter
        this.name=name;

    }
    public void setSalary(double salary){ //setter
        this.salary=salary;
    }

    public void disPlayEmployee(){
        //System.out.println("ID = "+this.id);
        System.out.println("Name = "+this.name);
        System.out.println("Salary = "+this.salary);
    }
    public String getName(){ //getter
        return this.name;
    }
    public double getSalary(){ //getter
        return this.salary;

    }
    public abstract void bonus(); //abstract
    
}

