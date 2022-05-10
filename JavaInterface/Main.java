public class Main {
    public static void main(String[] args) {
        Ironman h1 = new Ironman();
        h1.setName("Tony");
        h1.setAge("40");
        h1.displayHero();
        h1.skill("Shooting");
        

        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge("100");
        h2.displayHero();
        h2.weapon("hammer"); 
        h2.setNation("Thai");
        
    }
    
}
