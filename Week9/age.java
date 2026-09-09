void main() {
    IO.print("Enter age :");
    int age = Integer.parseInt(IO.readln());
    if (age < 0 || age > 120) {
        {
            IO.println("ไม่อยู่ในช่วงอายุที่ถูกต้อง");
        }
    } else if (age <= 10) {
        IO.println("Child");
    } else if (age <= 20) {
        IO.println("Teenager");
    } else if (age < 60) {
        IO.println("Adult");
    } else {
        IO.println("Senion");
    }
}
