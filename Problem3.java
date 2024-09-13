public class Problem3
{
    public static void main(String[] args)
    {
        double num = 51.2731;
        System.out.println("Decimal number: " + num);
        num *= 1000;
        int num1 = (int) (num % 10);
        num /= 10;
        int num2 = (int) (num % 10);
        num /= 10;
        int num3 =(int) (num % 10);
        num /= 10;
        System.out.print("Answer: " + num3 + " " + num2 + " " + num1 + " ");
    }
}

