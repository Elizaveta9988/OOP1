import java.util.ArrayList;

public class Monk extends BaseHero{
    int mana;
    public String Monk(ArrayList<BaseHero> gang, int x, int y){

    }
    (String name, int attack, int defence, int [] damage, int health, int speed, int mana , int x, int y) {
        super(name, attack, defence, damage, health, speed , x , y);
        this.mana=mana;
    }

        @Override
        public String toString() {
            return super.toString() +  ", Mana:"+ mana;


            public Monk (String name){
                super (name, attack: 12, defence: 7, new int[]{-4,-4}, health:30, speed:5);
                this.mana=1;
            }


        }