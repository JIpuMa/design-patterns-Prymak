public class DiscriminatorCalculation {
    Discriminator calcD(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        if (D > 0) {
            return new DiscriminatorGreaterThanZero(a, b, D);
        } else if (D == 0) {
            return new DiscriminatorEqualsZero(a, b);
        } else {
            return new DiscriminatorLessThanZero();
        }
    }
}
