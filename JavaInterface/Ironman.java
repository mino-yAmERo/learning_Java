class Ironman extends Superhero implements Skillhero{
    private String ironmanskill;
    public void skill(String skill){
        ironmanskill=skill; //เก็บค่าใน attribute
        System.out.println("Skill = "+ironmanskill);
    }
    
    public void moving(String moving){

    }
    public void weapon(String weapon){

    }
    public void jumping(String jump){

    }

}
