// COLLABORATORS: Sage Yosick

// DESCRIPTION:

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double initialAmount = 1.68;
    int centsRemaining = 0;
    int numQuarters = 0;
    int numDimes = 0;
    int numNickels = 0;
    int numPennies = 0;

    //CALCULATION SECTION
    centsRemaining = (int) (100 * initialAmount); 
    numQuarters = centsRemaining / 25;
    centsRemaining %= 25;
    numDimes = centsRemaining / 10; 
    centsRemaining %= 10;
    numNickels = centsRemaining / 5;
    centsRemaining %= 5;

    //OUTPUT SECTION
    System.out.println(centsRemaining); 
    System.out.println(numQuarters);
    System.out.println(numDimes);
    System.out.println(numNickels);

    System.out.printf( "$%.2f can be converted to %d quarters, %d dimes, %d nicklels, and %d pennies. ", initialAmount, numQuarters, numDimes, numNickels, centsRemaining);

  }

}
