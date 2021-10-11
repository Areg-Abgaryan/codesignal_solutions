public class Level1_IntroGates
{
    //  # 1
    public static int addTwoDigits(int n)
    {
        return n % 10 + (n / 10) % 10;
    }
  
    //  # 2
    public static int largestNumber(int n)
    {
        return (int)(Math.pow(10, n)) - 1;
    }

    //  # 3
    public static int candies(int n, int m)
    {
        return n * (m / n);
    }

    //  # 4
    public static int seatsInTheater(int nCols, int nRows, int col, int row)
    {
        return (nCols - col + 1) * (nRows - row);
    }

    //  # 5
    public static int maxMultiple(int divisor, int bound)
    {
        return bound - (bound % divisor);
    }

    //  # 6
    public static int circleOfNumbers(int n, int firstNumber)
    {
        if (firstNumber >= n / 2)
            return firstNumber - n / 2;
        return firstNumber + n / 2;
    }

    //  # 7
    public static int lateRide(int n)
    {
        int finalOutput = 0, hours = 0, minutes = 0;

        while (n >= 60)
        {
            n -= 60;
            ++hours;
        }
        minutes = n;

        while (hours != 0)
        {
            finalOutput += hours % 10;
            hours /= 10;
        }
        while (minutes != 0)
        {
            finalOutput += minutes % 10;
            minutes /= 10;
        }
        return finalOutput;
    }

    //  # 8
    public static int phoneCall(int min1, int min2_10, int min11, int s)
    {
        int minutes = 0;
        int rate = min1;

        while (s > 0)
        {
            ++minutes;
            if (minutes == 2)
                rate = min2_10;
            else if (minutes > 10)
                rate = min11;

            s -= rate;
            if (s < 0)
                --minutes;
        }
        return minutes;
    }
}
