void main() {
    IO.print("score 1 :");
    double Score1 = Double.parseDouble(IO.readln());
    IO.print("score2 : ");
    double Score2 = Double.parseDouble(IO.readln());
    IO.print("score3 : ");
    double Score3 = Double.parseDouble(IO.readln());
    IO.print("Bonus score : ");
    double bonusScore = Double.parseDouble(IO.readln());
    double totalScore = Score1 + Score2 + Score3;
    double totalScoreWithBonus = Score1 + Score2 + Score3 + bonusScore;
    double AvgTotalScoreWithBonus = totalScoreWithBonus / 3;
    IO.println("Total score " + totalScore);
    IO.println("Total score with bonus = " + totalScoreWithBonus);
    IO.println("Average of total score with bonus = %.2f".formatted(AvgTotalScoreWithBonus));
}