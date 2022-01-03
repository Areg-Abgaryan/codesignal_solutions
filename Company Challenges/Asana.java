public class Asana
{
    public static int[] tasksTypes(int[] deadlines, int day)
    {
        int today = 0, upcoming = 0, later = 0;
        for (int i = 0; i < deadlines.length; ++i)
        {
            if (deadlines[i] <= day)
                ++today;
            else if (deadlines[i] > day && deadlines[i] < day + 8)
                ++upcoming;
            else
                ++later;
        }
        return new int[]{ today, upcoming, later };
    }
}
