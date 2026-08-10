void main() {
    IO.print("Enter score 1 :");
    double score1 = Double.parseDouble(IO.readln());
    IO.print("Enter score 2 :");
    double score2 = Double.parseDouble(IO.readln());
    IO.print("Enter score 3 :");
    double score3 = Double.parseDouble(IO.readln());
    IO.print("Enter bonus score :");
    double bonus = Double.parseDouble(IO.readln());
    double total = score1 + score2 + score3;
    double totalBonus = total + bonus;
    double average = totalBonus / 3.0;

    IO.println("Total score=  %.2f points".formatted(total));
    IO.println("Total with bonus=  %.2f points".formatted(totalBonus));
    IO.println("Average of totalwaihbonus(" + totalBonus + ")=  %.2f points".formatted(average));  
}