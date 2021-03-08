public class Main {

    public static String formatMoney(double amount){
        char [] amountStr = (""+(int)amount).toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = amountStr.length-1; i >= 0; i--) {
            if((amountStr.length-i) % 3 == 1 && i!=amountStr.length-1){
                res.insert(0, ",");
            }
            res.insert(0, amountStr[i]);
        }
        StringBuilder decimals = new StringBuilder();
        String decimalsStr = ""+(amount-(int)amount);
        if(decimalsStr.contains(".")){
            // add 1-2 digits
            int decimalpointI = decimalsStr.indexOf(".");
            decimals.append(".");
            int i = 1;
            while(decimalpointI+i<decimalsStr.length()){
                if(i>2){
                    break;
                }
                decimals.append(decimalsStr.toCharArray()[decimalpointI + i]);
                i++;
            }
        }
        return "$ " + res + decimals;
    }

    public static void newline(){
        System.out.println();
    }



    public static void main(String[] args) {



        VendingMachine food = new VendingMachine("Food");
        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack bars = new Snack("Chocolate Bar", 36, 1.0,1);
        Snack pretzels = new Snack("Pretzel", 30, 2.0,1);
        VendingMachine drink = new VendingMachine("Drink");
        Snack soda = new Snack("Soda", 24, 2.50,2);
        Snack water = new Snack("Water", 20, 2.75,2);
        VendingMachine office = new VendingMachine("Office");

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        jane.buySnack(soda.getTotal(3));
        soda.buySnack(3);
        newline();
        jane.buySnack(pretzels.getTotal(1));
        pretzels.buySnack(1);
        newline();
        bob.buySnack(soda.getTotal(2));
        soda.buySnack(2);
        newline();
        jane.addCash(10.0);
        newline();
        jane.buySnack(bars.getTotal(1));
        bars.buySnack(1);
        newline();
        pretzels.addQuantity(12);
        newline();
        bob.buySnack(pretzels.getTotal(3));
        pretzels.buySnack(3);
        newline();

        System.out.println(chips.toString());
        System.out.println(bars.toString());
        System.out.println(pretzels.toString());
        System.out.println(soda.toString());
        System.out.println(water.toString());

        // Testing stretch goal of formatting money
        System.out.println(formatMoney(34544534.9999));
        System.out.println(formatMoney(7657));
        System.out.println(formatMoney(52));
    }
}
