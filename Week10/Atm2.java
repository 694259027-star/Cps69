void main() {
    final String correctPin = "1234";
    double balance = 10000.0;
    IO.print("Enter your PIN: ");
    String enTerPin = IO.readln();
    if (!enTerPin.equals(correctPin)) {
        IO.println("Incorrect PIN");
    } else {
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");
        IO.println("Select an option: ");
        int choice = Integer.parseInt(IO.readln());
        if (choice == 1) {
            IO.println("Remaining balance: " + balance + " baht");
        } else if (choice == 2) {
            IO.println("Enter the withdrawal amount: ");
            double withdrawal = Double.parseDouble(IO.readln());
            if (withdrawal <= 0) {
                IO.println("The amount must be greater than 0.");
            } else if (withdrawal <= balance) {
                balance -= withdrawal;
                IO.println("Withdrawal successful. Remaining balance: " + balance + " baht");
            } else {
                IO.println("Insufficient balance!");
            }
        } else if (choice == 3) {
            IO.print("Enter the deposit amount:");
            double deposit = Double.parseDouble(IO.readln());
            balance += deposit;
            if (deposit <= 0) {
                IO.println("The amount must be greater than 0.");
            } else {
                IO.println("Deposit successful.");
                IO.println("Updated balance: " + balance + " baht");
            }
        } else if (choice == 4) {
            IO.println("Thank you for using the ATM.");
        } else {
            IO.println("Invalid option.");
        }
    }
}