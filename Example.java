import java.util.ArrayList;

//main class
public class Example {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        //initialise items
        Item item_1 = new Item("apples", 20);
        Item item_2 = new Item("sword", 1);

        //add items to inventory
        inventory.addItem(item_1);
        inventory.addItem(item_2);

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
}

class Inventory{
    //ArrayList stores objects
    //differetn to arrays, which cannot store objects, only datatypes

    //declaring ArrayList 'items', which stores objects from class Example
    private ArrayList<Item> items;

    //constructor for class inventory
    //assigning value of new, empty arraylist to arraylist declared above
    public Inventory() {
        items = new ArrayList<>();
    }

    //method adds item to arraylist 'item' created above
    public void addItem(Item item) {
        items.add(item);
    }

    public void display_Inventory() {
        for(Item item : items) {
            System.out.println("Item: " + item.get_Name() + ", Amount: " + item.get_Amount());
        }
    }
}

class Fruit {
    private 
}