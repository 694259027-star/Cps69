void main() {
    IO.print("Enter Initial Saving :");
    double lnitialSaving = Double.parseDouble(IO.readln());
    IO.print("Enter MonthlySaving : ");
    double MonthlySaving = Double.parseDouble(IO.readln());
    IO.print("Enter Months : ");
    double Months = Double.parseDouble(IO.readln());
    IO.print("Enter lnterest percent : ");
    double lnterestPercent = Double.parseDouble(IO.readln());
    double TotalSaving = lnitialSaving + MonthlySaving * Months;
    double lnterest = TotalSaving * lnterestPercent / 100;
    double FinalSaving = TotalSaving + lnterest;

    IO.println("Totalsaving = %.2f bath".formatted(TotalSaving));
    IO.println("lnterest = %.2f bath".formatted(lnterest));
    IO.println("FinalSaving = %.2f bath".formatted(FinalSaving));
}
