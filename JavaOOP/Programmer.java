public class Programmer extends Employee {
    // Programmer extends Employee
    // Programmer สืบทอดคุณสมบัติจาก Employee
    //สามารถใช้ Attribute และ method ของ employeeได้
    
    /*
    public Programmer (String name,double salary){
        super(name,salary);
        System.out.println("I'm programmer");
    */    

    //overloading method
    /*
    public void skill (){
        System.out.println("No Skill");
    }
    public void skill (String...language){
        System.out.print("Skill :");
        for(int i=0;i<language.length;i++){
            System.out.print(" "+language[i]);
        }
        System.out.println(".");
    }
    */


    //Overiding
    
    public void bonus(){
        System.out.println("Programmer Bonus = 10%");
    }
    

    

}


    
    

