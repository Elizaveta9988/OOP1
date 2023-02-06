import java.util.ArrayList;

public class Ranged extends BaseHero{
    int shoots, maxHealth;

    public Ranged(ArrayList<BaseHero> teamList, String name , String role, Srting icon , int attack, int defence, int[] damage, int speed, int shoots, int x, int y ){
        super(teamList, name , role , icon, attack, defence, damage, health, speed, x,y);
    this.shoots = shoots;
    this.maxShoots = shoots;
    }
    @Override
    public void step(ArrayList<BaseHero> heroList){
        if (health ==0){
            return;
        }
        Vector2 target = getTarget(heroList);
        float constMin =12;
        float constMax =4;
        float attackPower;
        if (target.x <=constMax ){
            attackPower = damage [1];
        }else if (target.x >= constMin){
            attackPower = damage[0];
        }
        else{
            attackPower = damage[0] + ((target.x -constMax)/ (constMin -constMax)) * (damage[1] - damage[0]);
        }

        boolean doShoot = true;
        for (hero.role.equals("Framer")){
            if ((("Farmer")hero).sypply){
                heroList.get((int)target.y).getDamage(attackPower);
                System.out.print("\nПерсонаж %s %s совершил выстрел в персонажа %s $s нанес  %f урона и потратил 0 стрел. Осталось стрел %d/%d", name, role,heroList.get((int)target.y).health, name, role, attackPower,  -shoots, maxShoots);
                (("Farmer") hero).sypply = false;
                doShoot =false;
                break;
            }
        }
    }   if (doShoot){
        if (shoots >0){
            heroList.get((int)target.y).getDamage(attackPower);
            System.out.println("\nПерсонаж совершил выстрел  в персонажа %s %s нанес  %f урона и потратил 1 стрклу.Осталось  стрел %d/%d ", heroList.get((int)target.y)name, heroList.get((int)target.y) role,  attackPower , --shoots, maxShoots);
        }else{
            System.out.println("\nПерсонаж %s %s не может больше стрелять. Закончились стрелы %d/%d", name, role, shoots, maxShoots);
    } 
}

private BaseHero  getTarget (ArrayList<BaseHero> heroList){
    float minDistance = getPosition().getDistance(heroList.get(0).getPosition().x, heroList.get(0).getPosition().y;
    int minIndex = 0;
    for (int i = 0; i <heroList.size(); i++){
        float temp = getPosition().getDistance(heroList.get(0).getPosition().x, heroList.get(0).getPosition().y;
        if (temp <minDistance && heroList.get(i).health >0){
            minDistance = temp;
            minIndex = 1;
        }
        //System.out.println(getPosition().getDistance(target.getPosition().x target.getPosition().y));
    }
    return new  Vector2(minDistance, minIndex);
}

@Override
public String toString(){ return super.toString() + ", Shoots" + shoots + ", Max Shoots:" + maxShoots;}
}