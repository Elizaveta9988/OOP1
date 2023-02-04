public class main {
    
}
public class main {
    public static void main(String[] args){
        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();
        Random random = new Random();
        generateHeroes(heroesOne, quantity:10, random, mode:1);
        genrrateHeroes(heroesTwo, quantity: 10, random, mode:2);
        heroesOne.forEach(n -> System.out.printf(n.getInfo()+ ","));
        heroesOne.forEach(n -> n.step(heroesOne)));
        heroesOne.get(0).step(heroesOne);
        // chooseHero(heroes, "Mage");


        private static void generateHeroes(ArrayList<BaseHero> heroesList, int quantity, Random rand, int mode){
            String[] namesList  = { "Артём", "Александр", "Михаил", "Максим" , "Иван", "Даниил", "Дмитрий", "Кирилл", "Никита","Егор","Матвей","Андрей", "Роман","Сергей","Владистав",
                    "Платон","Герман","Игнат","Святослав","Анатолий","Тихон","Валерий","Мирослав","Ростислав","Борис","Филипп","Деньян","Прохор","Серафим",
                    "Аркадий","Архип","Тарас","Трофим"};
            int namesSize = namesList.length;
            for (int i = 0; i< quantity; i ++){
                int type = random.nextInt(bound:4);
                if (mode ==1){
                    switch (type){
                        case 0 -> heroesList.add(new Farmer(namesList[random.nextInt(namesSize)]));
                        case 1 -> heroesList.add(new Rogue(namesList[random.nextInt(namesSize)]));
                        case 2 -> heroesList.add(new Sniper(namesList[random.nextInt(namesSize)]));
                        case 3 -> heroesList.add(new Mage(namesList[random.nextInt(namesSize)]));

                    else{
                        switch (type){
                            case 0 -> heroesList.add(new Farmer(namesList[random.nextInt(namesSize)]));
                            case 1 -> heroesList.add(new Rogue(namesList[random.nextInt(namesSize)]));
                            case 2 -> heroesList.add(new Sniper(namesList[random.nextInt(namesSize)]));
                            case 3 -> heroesList.add(new Mage(namesList[random.nextInt(namesSize)]));
                        }
                        }

                    }
                }
            }



    }
}

    System.out.printf("\------------------");
    System.out.printf("List 1");
    System.out.printf(personList1);
    //Sniper sniper1 = new Sniper("sniper Sergey");
    //for (var item: personList1){
        //item.step(personlList1);
    //}
    for (int i=0; i<10; i++){

    }
    System.out.printf("\------------------");
    personList1.forEach(n-> n.step(personList1));
    System.out.println(personList1);




    //System.out.printf("\n------------------");
    //System.out.printf("List 2");
    //System.out.printf(personList2);

public static final int GANG_SIZE = 5;
public static ArrayList<BaseHero> whiteSide;
public static ArrayList<BaseHero> darkSide;
public static void main(String[] args){
    int();

    Scanner scanner = new Scanner(System.in);
    while(true){
        ConsoleSide.forEach(n-> n.step(darkSide));
        whiteSide.forEach(n-> n.step(darkSide));
        darkSide.forEach(n->n.step(whiteSide));
        scanner.nextLine();
    }
}

private static void init(){
    whileSide = new ArrayList<>();
    darkSide = new ArrayList<>();

    int x =1;
    int y =1;
    for(int i =0; i<GANG_SIZE; i++){
        switch( new Random().nextInt( bound:4)){
            case 0:whileSide.aad(new Farmer(whileSide, x, y++));break;
            case 1:whileSide.aad(new Rogue(whileSide, x, y++));break;
            case 2:whileSide.aad(new Sniper(whileSide, x, y++));break;
            default:whileSide.aad(new Monk(whileSide, x, y++));break;

        }
    }

    x = GANG_SIZE;
    y =1;
    for (int i = 0; i<GANG_SIZE; i++){
        switch(new Random().nextInt(bound:4)){
            case 0: darkSide.add(new Farmer(darkSide, x, y++));break;
            case 1:darkSide.add(new Spearman(darkSide,x, y++));break;
            case 2:darkSide.add(new Healer(darkSide, x,y++));break;
            default: darkSide.add(new Crossbownman(darkSide, x,y++));break;
        }
    }
}



