import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Healers<heroesList> extends  BaseHero{

    int mana;

    public Healers(ArrayList<BaseHero> gang, int x, int y)
    ( String name , String role , int attack, int defence, int [] damage , int health, int speed, int mana , int x, int y){
        super(name, role, attack,defence, damage,health,speed , x,y);
        this.mana =mana;
    }
}    


    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<BaseHero> heroesList) {
        ArrayList<Double> reduceHealth = new ArrayList<>();
        double max= 0;
        int maxi=0;
        for (int i =0; i < heroesList.size(); i++){
            String[] params = heroesList.get(i).getInfo().split( " ");
            if (Integer.parseInt(params[1]) != Integer.parseInt(params[2])){
              double temp = Double.parseDouble(params[1])/ Double.parseDouble(params[2]) * 100;
              if (temp > max){
                  max = temp;
                  maxi = i;
              }
 
              if (0 < max && max < 100){
                healing(teamList.get(maxi));
              }
        }
        Double max = Collections.max(reduceHealth);
        System.out.printf(max,);
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {return super.toString()+ ", Mana:" ;}

    }
if( teamList.get(index).hp == naxHp || teamList.get(index).hp<= 0){
    return;{

    }else if (teamList.get(index). hp - damage[0] > maxHp){
        teamList.get(index).hp = naxHp;
        System.out.println("Player" + this.name + " (" + this.getClass().getSimpleName() + ")" + "healed \uD83D\uDC9A" + teamList.get(index));

    }else{
        teamList.get(index).hp -= damage[0];
        System.out.println("Player" + this.name + "(" + this.getClass().getSimpleName()+ ")" "healed \uD83D\uDC9A"+ teamList.get(index)); 
    }
}

