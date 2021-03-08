
public class Snack {
    private int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineID;

    public Snack(String name, int quantity, double cost, int vendingMachineID) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID= vendingMachineID;
    }

    public void addQuantity(int amount){
        this.setQuantity(this.getQuantity()+amount);
        System.out.println("Quantity of "+ this.getName()+ " is " +this.getQuantity());
    }

    public void buySnack(int amount){
        if(this.getQuantity()-amount<0){
            System.out.println("Not enough snack left!");
            return;
        }
        this.setQuantity(this.getQuantity()-amount);
        System.out.println("Quantity of "+ this.getName()+ " is " +this.getQuantity());
    }

    public double getTotal(int amount){
        return amount * this.getCost();
    }


    @Override
    public String toString(){

        return "Snack: " + this.getName() + "\n" + "Vending Machine: " + (this.getVendingMachineID() == 1 ? "Food" : "Drink") + "\n" +"Quantity: " + this.getQuantity() + "\n" +"Total Cost: $" + this.getTotal(this.getQuantity()) + "\n";

    }

    public int getMaxId() {
        return maxId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachineID() {
        return vendingMachineID;
    }



    public void setMaxId(int maxId) {
        this.maxId = maxId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingMachineID(int vendingMachineID) {
        this.vendingMachineID = vendingMachineID;
    }
}
