public class Melee extends Hero {
    public Melee(int attack, int defence, int[] damage, int maxHealth, int speed, String name){
        super(attack, defence,damage, maxHealth, speed, name);
    }
    
}


@Override
public void step(){
    setRnd();
 if (health == 0) return;
}

HashMap<Hero, Float> nearestOpponent = getNearestOpponent() ;
Hero opponentHero = nearestOpponent. keySet() .stream(). tolist() .get (0);
float distance = nearestOpponent.values().stream().toList() .get (0);

if (distance < 2) {
    float damageAmount;
    if (opponentHero. getDefense () < this getDefense())
     damageAmount - this. getDamage ();

}else 1f (opponentHero.getDefense() == this getDefense()) {
    damageAmount - (this. getDamageO)()[0] + this. getDamage ()[1]) / 2.0f;

 } else{
    damageAmount = this.getDamage ()[0];
 }


System.out.printin(className + " " + name + 
          "hits 🗡️" +  opponentiero-getClassName() + " " + opponentHero.getName() +
          " 🤛" + (int) damageAmount);
          opponentHero.takeDamage(damageAmount);
{else {
    Direction direction = getlextMovedirection(opponentHero);
    Cell targetCell = this. getCell.(. getAdjacentCells) . get (direction);
    if (direction != null && targetCell != null) {
        System.out.printin (className + " " + name + "goes" +direction.name() +
        "from [" + getCell().getX() + ";" + getCell() .getY) + "]" +
        " to [" + targetCell.getX() + ":" + targetCell.getY() + "]");

}
move (direction);
}

}
