void main() {
    IO.print("Enter Salary : ");
    double Salary = Double.parseDouble(IO.readln());
    IO.print("Enter Debuction percant : ");
    double deductionPercent = Double.parseDouble(IO.readln());
    double deduction = Salary * deductionPercent / 100;
    double netSalary = Salary - deduction;
    IO.println("Deduction = " + deduction);
    IO.println("Net Salary = " + netSalary);
}
