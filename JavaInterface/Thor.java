public class Thor extends Superhero implements Skillhero {
    public void skill(String skill){
        
        System.out.println("Skill = "+skill); //ไม่ได้เก็บค่าใน Atrribute
    }

    public void moving(String moving){
        
    }
    public void weapon(String weapon){
        System.out.println("Weapon = "+weapon);
    }
    public void jumping(String jump){

    }
    public void setNation(String nation){
        System.out.println("Nation = "+nation);
    }
}
