void main() {
    IO.print("Enter number 1 :");
    int number1 = Integer.parseInt(IO.readln());

    IO.print("Enter number 2 :");
    int number2 = Integer.parseInt(IO.readln());

    int number3 = number1;
    number1 = number2;
    number2 = number3 ;

    IO.println("number 1 =" + number1 );
    IO.println("number 2 = " + number2 );
}