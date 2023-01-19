public class Farmer extends BaseHero{
    int supply;
    public String Farmer(String name, int attack, int defence, int damage, int health, int speed, int supply) {
        super(name, attack, defence, damage, health, speed);
        this.supply = supply;

        @Override
        public String toString() {
            return super.toString() + ",Supply" + supply;


        public Farmer(String name){
            super(name, attack:1, defence: 1, new int[]{1,1}, health:1, speed:1);
            this.supply =1;
            }

    }
}