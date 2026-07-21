void main() {
    IO.print("Enter fahrenheits : ");
    double fahrenheits = Double.parseDouble(IO.readln());
    double celsius = (5.0 / 9.0) * (fahrenheits - 32);
    IO.println("celsius = %.2f".formatted(celsius));
}