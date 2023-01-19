public class Sniper extends BaseHero{
    int shoots ;

    public String Sniper(String name, int attack, int defence, int [] damage, int health, int speed, int shoots) {
        super(name, attack, defence, damage, health, speed);
        this.shoots =shoots;


        @Override
        public String toString() {
            return super.toString() +  " ,Shoots:"+ shoots;
    }
}
    public Sniper (String name){
        super(name, attack: 12, defence: 10, new int[]{8,10}, health:15, speed:9);
        this.shoots=32;
    }