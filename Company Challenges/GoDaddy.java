public class GoDaddy
{
    public static String[] domainType(String[] domains)
    {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < domains.length; ++i)
        {
            int tempIndex = domains[i].lastIndexOf(".");
            if (domains[i].substring(tempIndex + 1).equals("org"))
                output.add("organization");
            if (domains[i].substring(tempIndex + 1).equals("com"))
                output.add("commercial");
            if (domains[i].substring(tempIndex + 1).equals("net"))
                output.add("network");
            if (domains[i].substring(tempIndex + 1).equals("info"))
                output.add("information");
        }
        String[] strOutput = output.toArray(new String[output.size()]);
        return strOutput;
    }
}
