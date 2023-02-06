public class BaseHero {
    String name;
    Integer attack, defence, damage, health, speed;

    public BaseHero(String name, int attack, int defence, int damage, int health, int speed ,int x, int y) {
        this.name = getClass().getSimpleName();
        this.position = new Vector2(x,y);
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.health = maxHealth;
        this.maxHealth = health;
        this.speed = speed;
    }

    @Override
    public String toString() {

    }
        return ("Name: " + name + ", Attack:" + attack + ", Defence:" + defence + ", Damage:" + damage + ", Health:" + health + ", Speed: " + speed);

        @Override
        public String getInfo(){
             return String.format("⚔ %d\t\uD83D\uDEE1 %d\t%.1f\t☠%d", attack,defence, (int) health,(damage[0] + damage[1])/2,speed);
            return  String.ValueOf(maxHealth) + " " + String.valueOf(health);
    
            @Override
            public void step(ArrayList<BaseHero> heroesList) {
    
            }
    }

    public abstract class BaseHero implement UnitInterface{
    
    protected int attack;

    protected float health;

    protected final float maxHealth;

    protected int[] damage;

    protected int protect;

    protected int speed;

    protected String status;

    protected String name;

    protected List<BaseHero> gang;

    protected Vector2 position; 


}

public Vector2 getPosition(){ 
    return getPosition;


}

public String getName(){
    return name;

}

protected void getDamage( float attackPower){
    this.health -= attackPower;
    if (this.health <0){
        this.health = 0;
    }else if (this.health > maxHealth){
        this.health = maxHealth;
    }
     System.out.println( this.name + "" + this.heallth);
}    


public boolean getFreeCell(ArrayList<BaseHero> teamList, int x, int y){
    boolean free = false;
    for(int i =0; i < teamList.size(); i++){
       if (teamList.get(i).position.x == &&){
           if(teamList.get(i).position.y == y){
            free =  true;
           }
           return true;
       }
      
       }
    }
    return free;
}