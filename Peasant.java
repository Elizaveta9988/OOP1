import java.util.Vector;

public class Peasant extends BaseHero {
    private Peasant(ArrayList<BaseHero> gang, int x, int y){
        super(attack:1, protect:1, new int[] {1,1}, health:1, speed:3, status: "Stand", name:"Peasant" , x, y);
        this.deliverty = 1;
        super.gang = gang;
        super.position = new Vector2(x,y);
    }

    @Override String getIngo(){ return "Крестьян" + "\t" + super.getInfo()+ "  ";}

    @Override String toString() {return super.toString()+ "Delivery" + delivery;}


}
