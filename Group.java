import java.util.ArrayList;

abstract class Group implements GroupInterface, Iterable<Hero>{
    protected List<Hero> group;

    int capacity;

    String name;

    public Group(String name){
        group = new ArrayList<>();
        this.name = name;

        public Group (String name) {this((new Faker()).lord0fTheRings().location());}

        public List<Hero> getHeroes(){return group;}

        public int getCapacity(){
            return capacity;
        }
            public void setCapacity(int capacity){
                this.capacity = capacity;
            }

            public int getSize(){return group.size();}

            public String getName(){return name;}

            public void setName(String name){this.name = name;}
        }
    }
    
}
