public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter your first number: ");
        double firstNum=37.4;
        System.out.println(firstNum);
        System.out.print("Enter your second number: ");
        double secondNum=37.4;
        System.out.println(secondNum);
        if (firstNum==secondNum)
        {
            System.out.println("Both numbers are equal!");
        }
        else if (firstNum>secondNum)
        {
            System.out.println(firstNum + " is greater than " + secondNum);
        }
        else
        {
            System.out.println(secondNum + " is greater than " + firstNum);
        }

    }
}