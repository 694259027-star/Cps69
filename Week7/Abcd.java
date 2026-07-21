void main() {
    IO.print(("Enter Number: "));
    int number = Integer.parseInt(IO.readln());
    if (number == 1) {
        IO.print(("Enter heightTriangl: "));
        double heightTriangle = Double.parseDouble(IO.readln());
        IO.print(("Enter base of Triangl:"));
        double base = Double.parseDouble(IO.readln());
        double area = (1.0 / 2.0) * heightTriangle * base;
        IO.println("Area of triangle = " + area);
    } else if (number == 2) {
        IO.print(("Enter weight: "));
        double weight = Double.parseDouble(IO.readln());
        IO.print(("Enter height: "));
        double height = Double.parseDouble(IO.readln());
        double BMI = weight / (height * height);
        IO.println("Your BMI is = %.2f".formatted(BMI));
    } else {
        IO.println("แกพิมพ์เลขผิด You idiot.");
    }
} 