public class main {
    
}
public class Main {
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





