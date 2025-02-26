import java.util.ArrayList;

//main class
public class Example {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        //initialise items
        Item item_1 = new Item("thing", 2);
        //Weapon weapon_1 = new Weapon("melee", "Sword", 2, 15);
        //Fruit fruit_1 = new Fruit("fuji", "apple", 50);

        //add items to inventory
        inventory.addItem(item_1);
        inventory.addItem("melee", "Sword", 2, 15);
        inventory.addItem("fuji", "apple", 50);


        //print items in inventory
        inventory.display_Inventory();
    }
}

class Item {
     //attributes
     private String name;
     private int amount;
 
     //constructor
     //constructors must be named the same as a class
     public Item(String name, int amount) {
         //this.___ lets params be the same as private attributes above
         this.name = name;
         this.amount = amount;
     }
 
     public String get_Name() {
         return name;
     }
 
     public int get_Amount() {
         return amount;
     }

     @Override
     public String toString() {
        return "Item: " + name + ", Quanitity: " + amount;
     }
}

class Inventory{
    //ArrayList stores objects
    //differetn to arrays, which cannot store objects, only datatypes

    //declaring ArrayList 'items', which stores objects from class Example
    private ArrayList<Item> items;

    //constructor
    //assigning value of new, empty arraylist to arraylist declared above
    public Inventory() {
        items = new ArrayList<>();
    }

    //method adds item to arraylist 'item' created above
    public void addItem(Item item) {
        items.add(item);
    }

    //method overload for fruit object
    public void addItem(String type, String name, int amount) {
        items.add(new Fruit(type, name, amount));
    }

    //method overload for weaplon object
    public void addItem(String type, String name, int amount, int damage) {
        items.add(new Weapon(type, name, amount, damage));
    }

    //method displays all items in inventory to command line
    public void display_Inventory() {
        for(Item item : items) {
            System.out.println(item.toString());
        }
    }
}

class Fruit extends Item {
    private String type;

    //constructor
    public Fruit(String type, String name, int amount){
        super(name, amount);
        this.type = type;
    }

    @Override
     public String toString() {
        return "Type: " + type + ", Name: " + get_Name() + ", Quanitity: " + get_Amount();
     }
}

class Weapon extends Item {
    private String weap_Class;
    private int dmg;

    //constructor
    public Weapon(String weap_Class, String name, int amount, int dmg){
        super(name, amount);
        this.weap_Class = weap_Class;
        this.dmg = dmg;
    }

    public int get_Damage() {
        return dmg;
    }

    public String get_Class() {
        return weap_Class;
    }

    @Override
     public String toString() {
        return "Class: " + weap_Class + ", Name: " + get_Name() + ", Quanitity: " + get_Amount() + ", Damage: " + dmg;
     }
}
