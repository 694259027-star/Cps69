void main() {

    int pinCorrect = 1234;
    double balance = 1234;

    IO.print("Enter your PIN: ");
    int pin = Integer.parseInt(IO.readln());

    if (pin == pinCorrect) {

        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");

        IO.print("Select an option: ");
        int menu = Integer.parseInt(IO.readln());

        switch (menu) {

            case 1:
                IO.println("Remaining balance: " + balance + " baht");
                break;

            case 2:
                IO.print("Enter amount to withdraw: ");
                double withdraw = Double.parseDouble(IO.readln());

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    IO.println("Remaining balance: " + balance + " baht");
                } else {
                    IO.println("Insufficient balance.");
                }
                break;

            case 3:
                IO.print("Enter amount to deposit: ");
                double deposit = Double.parseDouble(IO.readln());

                balance = balance + deposit;
                IO.println("Remaining balance: " + balance + " baht");
                break;

            case 4:
                IO.println("Thank you for using the ATM.");
                break;

            default:
                IO.println("Invalid menu option.");
        }

    } else {
        IO.println("Incorrect PIN.");
    }
}