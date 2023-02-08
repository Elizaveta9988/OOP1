import javax.swing.GroupLayout.Group;

public class Team extends Group {
    private final String color;

    private Team opponenTeam;

    public Team (String color){
        super();
        this.setCapacity(10);
        this.color =color;

    }
    @Override
    public void add(Hero hero){
        super.add(hero);
        hero.setTeam(this);
    }
    public String getColor(){return color;}

    public Team get0pponenTeam(){ return opponenTeam;}

    public void set0pponentTeam(Team opponenTeam){this.opponenTeam = opponenTeam;}
}
