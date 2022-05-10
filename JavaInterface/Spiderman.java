public class Spiderman extends Superhero implements Skillhero{
    private String spidermanskill; //Attribute

    public void skill(String skill){
        spidermanskill=skill; //เก็บค่าใน attribute
        System.out.println("Skill = "+spidermanskill);
    }

    public void moving(String moving){

    }
    public void weapon(String weapon){

    }
    public void jumping(String jump){

    }
}
