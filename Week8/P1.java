void main (){
     IO.print("Enter product : ");
    int product = Integer.parseInt(IO.readln());
    IO.print("Enter quantity : ");
    int quantity = Integer.parseInt(IO.readln());
    int total = (product * quantity);
    IO.println("total is : " + total + " baht");
    if (total > 1000){
         IO.println("Not enough money!!");
    } else {
    int sum = 1000-total;
     IO.println("sum is : " + sum + " baht");
    int b500 = sum / 500;
    sum = sum % 500;
    int b100 = sum /100;
    sum = sum % 100;
    int b50 = sum /50;
    sum = sum % 50;
    int b20 = sum /20;
    sum = sum % 20;
    int c10 = sum /10;
    sum = sum % 10;
    int c5 = sum /5;
    sum = sum %5;
    int c2 = sum /2;
    sum = sum % 2;
    int c1 = sum;
    IO.println("Five-hundred :"+ b500 +" note(s");
    IO.println("Hundred note :"+ b100 +" note(s");
    IO.println("Fifty note  :"+ b50 +" note(s");
    IO.println("Twent note :"+ b20 +" note(s");
    IO.println("Ten coin  :"+ c10 +" note(s");
    IO.println("Five coin  :"+ c5 +" note(s");
    IO.println("Two coin  :"+ c2 +" note(s");
    IO.println("One coin  :"+ c1 +" note(s");
    }
}