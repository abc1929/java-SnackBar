public class Customer {
    private int maxId = 0;
    private int id;
    private String name;
    private double cash;


    public Customer(String name, double cash) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public void addCash(double amount){
        this.setCash(this.getCash()+amount);
        System.out.println(this.getName()+" cash on hand $"+this.getCash());
    }


    public void buySnack(double totalAmount){
        if(this.getCash()-totalAmount<0){
            System.out.println("Not enough cash on hand");
            return;
        }

        this.setCash(this.getCash()-totalAmount);
        System.out.println(this.getName()+" cash on hand $"+this.getCash());

    }





    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
