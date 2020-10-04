import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


public class TestDivison {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(3, 5);
        var result = fraction.dividedBy(new NotImplementedFraction(3, 5));

        System.out.println(result);

        Assert.assertEquals((Integer) 15, result.getNumerator());
        Assert.assertEquals((Integer) 15, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(1, 2);
        var result = fraction.dividedBy(new NotImplementedFraction(1, 2));

        System.out.println(result);

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
