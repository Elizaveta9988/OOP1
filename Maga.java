import java.util.ArrayList;
import java.util.Random;

import org.w3c.dom.html.HTMLTableRowElement;

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

@Override
public void step(){
    setRnd();
    if (isPass()){
        setPass(false);
        return;
    }
    if(health == 0) return;
    
    for ( Hero deadHero: team){
        if(deadHero.getHealth() ==0){
            RandomFactory RandomFactoryTeam1 = new RandomFactory(new HeroFactory[]){
                new PeasantFactory();
                new RoqueFactory();
                new SniperFactory();
                new WizardFactory();
            }};
            RandomFactory RandomFactoryTeam2 = new RandomFactory(new HeroFactory[]){
                new CrossbowmanFactory(),
                new MonkFactory(),
                new PeasantFactory(),
                new SpearmanFacrory(),
            }};
            
            Cell teamCell = deadHero.getCell();
            Team teamTeam = deadHero.getTeam();
            int index = teamTeam.getHeroes().index0f(deadHero);

            System.out.println(this.getClassName() + " " + this.getName()+
                   "resurrects" + deadHero.getName());

            deadHero = team.getColor().equals("red") ? RandomFactoryTeam1.create():RandomFactoryTeam2.creat();
            deadHero = team.getColor().equals("red") ? RandomFactoryTeam1.create() :  RandomFactoryTeam2.create();
            teamCell.setHero(deadHero);
            deadHero.setTeam(tempTeam);
          
            teamTeam.getHeroes().set(index, deadHero);
            setPass(true);

            System.out.println(deadHero.getClassName() + " " + deadHero.getName()+
                   "now alive" );
            return;

        }
    }

    Hero lowestHealthHero = null;
    float lowestHealthPoints =1000;
    for (Hero hero : team){
        if(hero getHealth() > 0 && hero.getHealth() <hero.getMaxHealth() && hero.getHealth() < lowestHealthHero){
            lowestHealthPoints = hero.getHealth();
            lowestHealthHero = hero;
        }
    }

    if (lowestHealthHero != null){
        lowestHealthHero.takeDamage(this.getDamage()[0]);
        System.out.println(this.getClassName() + "💚" + -this.getDamage()[0]);
    }else{
        System.out.println(ClassName + " " + name + " wanted to heal teammates, but their HP are full");
    }
}