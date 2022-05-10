abstract class Superhero {
    private String superheroName;
    private String superheroAge;
    private String superheroJob;
    
    public void setName(String name){
        superheroName=name;
    }
    public void setAge(String age){
        superheroAge=age;
    }
    public void displayHero(){
        System.out.println("Name : "+superheroName);
        System.out.println("Age : "+superheroAge);
    }
    public abstract void skill(String skill);






}
