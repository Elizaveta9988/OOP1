public class Monk extends BaseHero{
    int mana;
    public String Monk(String name, int attack, int defence, int [] damage, int health, int speed, int mana) {
        super(name, attack, defence, damage, health, speed);
        this.mana=mana;


        @Override
        public String toString() {
            return super.toString() +  ", Mana:"+ mana;


            public Monk (String name){
                super (name, attack: 12, defence: 7, new int[]{-4,-4}, health:30, speed:5);
                this.mana=1;
            }


        }