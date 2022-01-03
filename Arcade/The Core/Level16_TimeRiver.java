public class Level16_TimeRiver
{
    //  # 130
    public static boolean validTime(String time)
    {
        String[] array = time.split(":");
        if (Integer.parseInt(array[0]) < 0 || Integer.parseInt(array[0]) > 23 ||
                Integer.parseInt(array[1]) < 0 || Integer.parseInt(array[1]) > 59)
            return false;
        return true;
    }
}
