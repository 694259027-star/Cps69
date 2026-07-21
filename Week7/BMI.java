void main() {
    IO.println("Enter a number : ");
    int number = Integer.parseInt(IO.readln());
if (number == 1) {
        IO.println("Enter the base of the triangle: ");
        double base = Integer.parseInt(IO.readln());
        IO.println("Enter the height of the triangle: ");
        double height = Integer.parseInt(IO.readln());
        IO.println(" Area of the triangle: ");
        double Areaofthetriangle = 0.5 * (base * height) /2;
    }
else {
        IO.println("Enter the your weight: ");
        double weight = Double.parseDouble(IO.readln());
        IO.println("Enter the height in meter: ");
        double heightmeters = Double.parseDouble(IO.readln());
        IO.println(" Your BMI for weight: ");
        double BMI = weight / (heightmeters * heightmeters);
        IO.println("You BMI is : " + BMI);
    }
}