void main() {
    IO.print("Enter Price: ");
    int Price = Integer.parseInt(IO.readln());
    IO.print("Enter Quantity: ");
    int Quantity = Integer.parseInt(IO.readln());
    int totalprice = Price * Quantity;
    int money = 1000;
    if (money < totalprice ) { IO.print("Not enough money!!");

    } else {
        int change = money - totalprice;
    
    int initialChange = money - totalprice;

    int b500 = change / 500;
    change = change % 500;
    int b100 = change / 100;
    change = change % 100;
    int b50 = change / 50;
    change = change % 50;
    int b20 = change / 20;
    change = change % 20;
    int c10 = change / 10;
    change = change % 10;
    int c5 = change / 5;
    change = change % 5;
    int c2 = change / 2;
    change = change % 2;
    int c1 = change;

    IO.println("Totalprice = "  + totalprice);
    IO.println("Change is = " + initialChange   +  "baht");
    IO.println("500 = " + b500  + " note(s)");
    IO.println("100 = " + b100  + " note(s)");
    IO.println("50 = " + b50  + " note(s)");
    IO.println("20 = " + b20  + " note(s)");
    IO.println("10 = " + c10  + " coin(s)");
    IO.println("5 = " + c5  + " coin(s)");
    IO.println("2 = " + c2  + " coin(s)");
    IO.println("1 = " + c1  + " coin(s)");
    }
}