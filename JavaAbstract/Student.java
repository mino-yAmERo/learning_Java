abstract class Student {
    private String idnum;
    private String studentname;

    public abstract void Register();
    public abstract void Pretest();
    public abstract void Posttest();
    public void setID(String id){
        idnum=id;
    }
    public void display(){
        System.out.println("Name : "+idnum);
    }
}
