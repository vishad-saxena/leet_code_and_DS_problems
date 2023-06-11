import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectToBigIntegerCasting
{
    public static void main(String[] args) {
        List<Object> list= Arrays.asList(24l);
        System.out.println(list.get(0) instanceof BigInteger);
        BigInteger bi=(BigInteger)(list.get(0));
        System.out.println(bi instanceof BigInteger);
    }
}
