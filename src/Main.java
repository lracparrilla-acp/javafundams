//compound interest calculator
//Enter principal amount, interest rate (%), # of times compounded per year, # of years.
// A = P[1+ r/n]^nt

void main() {
    
    Scanner scanner = new Scanner(System.in);
    IO.println("Enter principal amount");
    double principal = scanner.nextDouble();
    IO.println("Enter interest rate (in %)");
    double rate = scanner.nextDouble() / 100;
    IO.println("Enter # of times compounded per year");
    int timesCompounded = scanner.nextInt();
    IO.println("Enter # of years invested");
    int years = scanner.nextInt();
    double amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
    scanner.close();
    System.out.printf("The amount after %d years is $%.2f", years, amount);

}