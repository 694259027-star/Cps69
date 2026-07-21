void main() {
    int male = 1;
    int female = 2;
    IO.print("Enter Gender (1 for male, 2 for female): ");
    int gender = Integer.parseInt(IO.readln());
    IO.print("Enter weight (kg): ");
    double weight = Double.parseDouble(IO.readln());
    IO.print("Enter height (cm): ");
    double height = Double.parseDouble(IO.readln());
    IO.print("Enter age (years): ");
    double age = Double.parseDouble(IO.readln());
    if (gender == 1) {
        double bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        IO.println("Your BMR is " + bmr);
    } else {
        double bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        IO.println("Your BMR is " + bmr);
    }
}