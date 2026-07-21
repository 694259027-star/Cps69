void main() {
    IO.print(("Enter midterm score: "));
    int mScore = Integer.parseInt(IO.readln());
    IO.print(("Enter final score: "));
    int fScore = Integer.parseInt(IO.readln());
    int totalScore = mScore + fScore;
    if (totalScore >= 50) {
        IO.println("Your total score is " + totalScore + " the result is Pass!!");
    } else {
        IO.println("Your total score is " + totalScore + " the result is Fail!!");
    }
} 