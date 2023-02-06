import java.util.ArrayList;

public class Warriors extends BaseHero {
    public Warriors(ArrayList<BaseHero> myTeam , String name, int hp, int attack, int defence, int [] damage, int speed, int x , int y){

    }
    @Override String toString(){ return String. format("%s %11s", super.toString(),"");}


}

public void step(ArrayList<BaseHero> teamList){
    int index =0;
    if (this.hp ==0){
        System.out.println(AnsiColors.ANSI_RED + this.name + "" + this.getClass().getSimpleName()+ "is dead ❌ ☠ " + AnsiColors.ANSI_RESET);
    }else{
        float min = Float.MAX_VALUE;
        int index = 0;
        for (int i = 0; i<teamList.size(); i++){
            if (teamList.get(i).hp != 0){
                if (min > getDistance(teamList.get(i).position.x, teamList.get(i).position.y)){
                    min =  getDistance(teamList.get(i).position.x, teamList.get(i).position.y);
                    index =1;
                }
            }
        }
    }
    //System.out.println(this. position.x);
   // System.out.println(this. position.y);
   float posX;
   float posY;
   posX = this.position.x - teamList.get(index).position.x;
   posY = this.position.y - teamList.get(index).position.y;

   if (posY == 0 ){
    if (posX <0){
       //if(getFreeCell(this.myTeam, this.position.x + 1, this.position.y)){

       }
            this.position.x +=1;
        }else{
            this.position.x +=1;
        }
    }
     if (posY <0){
        this.position.y +=1;
     }

    if (posY >0){
        this.position.y -=1;
    }
   
   

 //  if (this.position.x == teamList.get(index).position.x){
       //  this.position.x
  //  }
    //this.position.x +=1;
}