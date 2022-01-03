public class Uber
{
    public static double[] fareEstimator(int ride_time, int ride_distance, double[] cost_per_minute, double[] cost_per_mile)
    {
        ArrayList<Double> properties = new ArrayList<>();
        for (int i = 0; i < cost_per_mile.length; ++i)
            properties.add(ride_time * cost_per_minute[i] + ride_distance * cost_per_mile[i]);

        return properties.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
