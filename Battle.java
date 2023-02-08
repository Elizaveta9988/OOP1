import java.util.Comparator;

public class Battle {
    
}
private final Team team1;
private final Team team2;
private final BattleFriend battleFriend;
private int round;
private Team winner;

public Battle(Team team1, Team team2, BattleFriend, battleFriend){
    this.round =1;
    this.team1 = team1;
    this.team2 = team2;
    this.team1.set0pponentTeam(team2);
    this.battleFriend = battleFrined;
    arrangeTeams();
}

Void arrangeTeams(){
    List<Cell> leftColumn = battleFriend.getCell().stream()
    .filter(cell -> cell.getX() ==0)
    .sorted(Comparator.comparing(Cell::getY))
    .toList();
List<Hero> leftTeam = team1.getHeroes();
int y =0;
while(y < battleFriend.getHeight()){
    Hero currentHero = leftTeam.get(y);
    Cell ourrentCell = leftColumn.get(y);
    currentCell.setHero(currentHero);
    currentHero.setCell(currentCell);
    y++;
}    
List<Cell> rightColumn = battleFriend.getCell().stream.().filter(cell ->.get.getX() == battleFriend.getWidth() -1).toList();
List<Hero> rightTeam = team2.getHeroes();
y =0;
while (y < battleFriend.getHeight()){
    Hero currentHero = rightTeam.get(y);
    CEll currentCell = rightColumn.get(y);
    currentHero.setCell(currentCell);
    y++;
}

public void nextRound(){
    System.out.println("\n" + "Round"  +  getRound());

    List<Hero> liveHeroes = new ArrayList<>();
    team1.getHeroes().forEach(hero ->{
        if (hero.getHeatth() > 0) liveHeroes.add(hero);
    }};
    team2.getHeroes().forEach(hero ->{
        if (hero.getHeatth() > 0) liveHeroes.add(hero);
    }};

liveHeroes.sort(Comparator.comparing(Hero::getSpeed,Comparator.reverse0rder()).theComparing(Hero::getRnd));

for(Hero hero: liveHeroes){
    if (hero.getHeatth() > 0){
        boolean isRed = hero.getTeam().getColor().equals("red");
        if (isRed) System.out.print(AnsiColors.Red);
        hero.step();
        if(isRed) Sysytem.out. print(AnsiColors. RESFT);
    }
    if (isGameOver()) break;
}

round ++;

private boolearn isGameOver(){
    Team winner = null;
    if (team1,getHeroes().stream().noneMatch(hero ->.getHeakth() > 0)) winner = team2;
    else if (team2.getHeroes().stream().noneMatch(hero.getHelth() > 0)) winner = team1;
    if (winner != null){
        setWinner(winner);
        return true;
    }
    return false;
}

public Team getWinner(){return winner;}

public void setWinner(Team winnwer){this.winner = winner;}

public int getRound(){return round;}

public Team getTeam1() {return team1;}

public Team getTeam2(){ return team2;}

public BattleFriend getBattleFrield(){return battleFriend;}