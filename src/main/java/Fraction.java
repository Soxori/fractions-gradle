public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int SpolecnyJmenovatel = getDenominator() * other.getDenominator();
        int Citatel = (getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator());
        return new Fraction(Citatel, SpolecnyJmenovatel);
    }

    @Override
    public IFraction minus(IFraction other) {
        int SpolecnyJmenovatel = getDenominator() * other.getDenominator();
        int Citatel = (getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator());
        return new Fraction(Citatel, SpolecnyJmenovatel);
    }

    @Override
    public IFraction times(IFraction other) {
        int SpolecnyJmenovatel = getDenominator() * other.getDenominator();
        int Citatel = getNumerator() * other.getNumerator();
        return new Fraction(Citatel, SpolecnyJmenovatel);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int SpolecnyJmenovatel = getDenominator() * other.getNumerator();
        int Citatel = other.getDenominator() * getNumerator();
        return  new Fraction(Citatel, SpolecnyJmenovatel);
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        var NejvetsiDelitel = gcdByEuclidsAlgorithm(numerator, denominator);
        int i = numerator / NejvetsiDelitel;
        int j = denominator / NejvetsiDelitel;
        return new Fraction(i,j);
    }

    private static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }

}
