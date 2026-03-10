public class Program
{
    public static void main(String[] args)
    {
        mystery(4);
        System.out.println();
        System.out.println(digitSum(538));
        System.out.println();
        System.out.println(reverse("hello"));
    }

    public static void mystery(int n)
    {
    if (n == 0)
    {
        return;
    }

    mystery(n - 1);
    System.out.println(n);
    }

    public static int digitSum(int n)
    {
        if (n / 10 == 0)
            return n;
        return (n % 10) + digitSum(n / 10);
    }

    public static String reverse(String s)
    {
        if (s.length() == 1)
            return s;
        return s.substring(s.length() - 1) + reverse(s.substring(0, s.length - 1));
    }
}