import java.util.ArrayList;

public class Sniper extends BaseHero{
     private int shoots ;

    public String Sniper(String name, int attack, int defence, int [] damage, int health, int speed, int shoots) {
        super(name, attack, defence, damage, health, speed);
        this.shoots =shoots;


        @Override
        public String toString() {
            return super.toString() +  " ,Shoots:"+ shoots;
    }
}
}
    public Sniper (String name){
        super(name, attack: 12, defence: 10, new int[]{8,10}, health:15, speed:9);
        this.shoots=32;
    }


    @Override
    public void step(ArrayList<BaseUnit>list){
        for(int i = 0; i<list.size(); i++){
            if (list.get(i).getType().equals("farmer")){
                if(((Farmer)list.get(i)).supply > 0){
                    ((Farmer)list.get(i)).sypply -=1;
                System.out.println("Боец"+ this.getType() + "по имени "
                + this.getName() + "делает один выстрел");
                System.out.println("Оставшееся количество выстрелов рвно "+ shots);
                return;
            }else{
                continue;
                
            }
        } 
        
        shoots -=1;
                System.out.println("Боец"+ this.getType() + "по имени "
                + this.getName() + "делает один выстрел");
                System.out.println("Оставшееся количество выстрелов рвно "+ shots);

    }





    public int getShorts(){
        return shoots;
    }
