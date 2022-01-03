public class Level3_CornerOf0sAnd1s
{
    //  # 17
    public static int killKthBit(int n, int k)
    {
        return n & ~(1 << (k - 1));
    }
}
