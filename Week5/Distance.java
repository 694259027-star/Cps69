void main() {
    IO.print("Distance (km) : ");
    double distance = Double.parseDouble(IO.readln());
    IO.print("Fuel efficiency : ");
    double fuelefficiency = Double.parseDouble(IO.readln());
    IO.print("Fuel price per liter : ");
    double fuelPricerLiter = Double.parseDouble(IO.readln());
    double fuelUsed = distance / fuelefficiency;
    double totalCost = fuelUsed * fuelPricerLiter;
    IO.println("Fual used = %.2f,Total cost = %.2f".formatted(fuelUsed, totalCost));
}