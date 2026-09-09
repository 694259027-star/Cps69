void main() {
    IO.print("Enter age :");
    int age = Integer.parseInt(IO.readln());
    if (age > 60) {
        {
            IO.println("ไม่อยู่ในช่วงอายุที่ถูกต้อง");
        }
    } else if (age > 29) {
        IO.println("Child");
    } else if (age > 19) {
        IO.println("Teenager");
    } else if (age > 9) {
        IO.println("Adult");
    } else {
        IO.println("Senion");
    }
}
