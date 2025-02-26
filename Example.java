public class Example {
    //attributes
    private String name;
    private int amount;

    //constructor
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
