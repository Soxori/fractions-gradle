import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


public class TestSubtraction {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(3, 5);
        var result = fraction.minus(new NotImplementedFraction(3, 5));

        System.out.println(result);

        Assert.assertEquals((Integer) 0, result.getNumerator());
        Assert.assertEquals((Integer) 25, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(1, 2);
        var result = fraction.minus(new NotImplementedFraction(1, 2));

        System.out.println(result);

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
