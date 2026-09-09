void main() {
    IO.print(" Enter score : ");
    int score = Integer.parseInt(IO.readln());
    if (score < 0 || score > 100) {
        IO.print("You must enter a correct score, try again later");
    } else if (score > 80) {
        IO.print("Your grade is A");
    } else if (score > 70) {
        IO.print("Your grade is B");
    } else if (score > 60) {
        IO.print("Your grade is C");
    } else if (score > 50) {
        IO.print("Your grade is D");
    } else {
        IO.println("Your grade is E");
    }
}