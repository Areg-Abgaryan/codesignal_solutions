import java.util.ArrayList;
import java.util.Collections;

public class Level11_RainbowOfClarity
{
    //  # 48
    public static boolean isDigit(char symbol)
    {
        return Character.isDigit(symbol);
    }

    //  # 50
    public static int chessKnight(String cell)
    {
        return helperChessKnight(cell.charAt(0), cell.charAt(1));
    }
    public static int helperChessKnight(char horizontal, char vertical)
    {
        int moves = 0;
        if (horizontal - 2 >= 'a' && vertical + 1 <= '8') ++moves;
        if (horizontal - 1 >= 'a' && vertical + 2 <= '8') ++moves;
        if (horizontal - 1 >= 'a' && vertical - 2 >= '1') ++moves;
        if (horizontal - 2 >= 'a' && vertical - 1 >= '1') ++moves;

        if (horizontal + 2 <= 'h' && vertical + 1 <= '8') ++moves;
        if (horizontal + 1 <= 'h' && vertical + 2 <= '8') ++moves;
        if (horizontal + 1 <= 'h' && vertical - 2 >= '1') ++moves;
        if (horizontal + 2 <= 'h' && vertical - 1 >= '1') ++moves;
        return moves;
    }

    //  # 51
    public static int deleteDigit(int n)
    {
        ArrayList<Integer> possibleVariants = new ArrayList<>();
        StringBuilder strBuilder = new StringBuilder();

        while (n != 0)
        {
            strBuilder.append(n % 10);
            n /= 10;
        }
        strBuilder = strBuilder.reverse();

        for (int i = 0; i < strBuilder.length(); ++i)
        {
            StringBuilder tempBuilder = new StringBuilder();
            for (int g = 0; g < strBuilder.length(); ++g)
                if (g != i)
                    tempBuilder.append(strBuilder.charAt(g));
            possibleVariants.add(Integer.parseInt(tempBuilder.toString()));
        }
        Collections.sort(possibleVariants);
        return possibleVariants.get(possibleVariants.size() - 1);
    }
}
