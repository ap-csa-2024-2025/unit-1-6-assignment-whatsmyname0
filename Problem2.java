public class Problem2
{
    public static void main(String[] args)
    {
        System.out.println("2 original number:  ");
        double Num1 = 50.201;
        double Num2 = 81.871;
        System.out.println(Num1);
        System.out.println(Num2);
        int rounded1 = (int) (Num1 + 0.5);
        int rounded2 = (int) (Num2 + 0.5);
        int answer = rounded1 + rounded2;
        System.out.println("Answer: " + answer);
    }
}

