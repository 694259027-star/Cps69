void main () {
    IO.print("Enter number 1 :");
    int number1 = Integer.parseInt(IO.readln());

    IO.print("Enter number 2 :");
    int number2 = Integer.parseInt(IO.readln());

    if (number2 > number1) {
        IO.print("The second number is more than the first number ... Do nothing .. Bye bye !!!");

    }
else{
    int number3 = number1;
    number1 = number2;
    number2 = number3;

    IO.println("number 1 =" + number1);
    IO.println("number 2 = " + number2);
}
}