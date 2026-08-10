void main() {
    IO.print("Enter the price of the product (per unit): ");
    double price = Double.parseDouble(IO.readln());

    IO.print("Enter the quantity of the product: ");
    double quautity = Double.parseDouble(IO.readln());
    
    double totalprice = price * quautity;
    double netprice;
    double discount;
    

    if (price > 10 ) {
         discount = totalprice * 0.10;
         netprice = totalprice - discount;
        IO.print("You get a 10% discount!");
    IO.println("Totalprice " + netprice  + " Baht");

    } else {
        
         discount = 0;
         netprice = totalprice - discount;

        IO.println("Totalprice " + netprice +  " Baht");
        
    }
}
