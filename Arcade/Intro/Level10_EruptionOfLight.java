public class Level10_EruptionOfLight
{
    //  # 44
    public static String findEmailDomain(String address)
    {
        int index = address.lastIndexOf("@");
        return address.substring(index + 1);
    }
}
