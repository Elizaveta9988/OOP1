import java.util.ArrayList;

public class Maga  extends BaseHero{
    int mana;
    public Mage(ArrayList<BaseHero> gang, int x, int y){
        
    }
    (String name, int attack, int defence, int [] damage, int health, int speed, int mana ,  int x, int y) {
        super(name, attack, defence, damage, health, speed);
        this.mana = mana;


        @Override
        public String toString() {
            return.super toString()+ ",Mana:" + mana;

        }
}
    public Mage (String name){
        super (name, attack: 17, defence: 12, new int[]{-5,-5}, health:30, speed:9);
        this.mana=1;
    }

@Override
public void step(ArrayList<BaseHero> list){
    int ibdex = 0;
    int min = list.get(0).getHealth();
    for ( int i = 0; i< list.size(); i++){
        if ( min > list.get(i).getHealth()){
            min = list.get(i).getHealth();
            index = i;
        }
    }
}

