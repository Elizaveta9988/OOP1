public class Crossbownman extends BaseHero{
    int shoots;
    public String crossbownman (String name, int attack, int defence, int  [] damage, int health, int speed, int shoots) {
        super(name, attack, defence, damage, health, speed);
        this.shoots=shoots;

        @Override
        public String toString() {
            return super.toString() +   ", Shoots:" + shoots;
        }

        public Crossbownman(String name){
            super (name, attack: 6, defence: 3, new int[]{2,3}, health:10, speed:4);
            this.shoots=16;
        }

