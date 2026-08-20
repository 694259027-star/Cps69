void main() {
    int number3 = 0;
    IO.print("Enter  number1 : ");
    int number1 = Integer.parseInt(IO.readln());
    IO.print("Enter number2 : ");
    int number2 = Integer.parseInt(IO.readln());
    if (number2 > number1) {
        IO.println(" current -> number1 = " + number1 + " number2 = " + number2);
        IO.println("The second number is more than the first number ... Do nothing .. Bye bye !!!");
    } else {
        IO.println("Current -> number 1 = " + number1 + " and Number 2 = " + number2);
        IO.println("Swapping . . . . . . . ");
        number3 = number1;
        number1 = number2;
        number2 = number3;
        IO.println("Now -> Number 1 = " + number1 + " Number 2 = " + number2);
    }
}

