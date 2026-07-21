void main() {
    int hours = Integer.parseInt(IO.readln(" Enter hours : "));
    int minutes = Integer.parseInt(IO.readln("Enter minutes : "));
    int totalMinutes = hours * 60 + minutes;
    IO.println("Total minutes  = " + totalMinutes + "minute");
}
