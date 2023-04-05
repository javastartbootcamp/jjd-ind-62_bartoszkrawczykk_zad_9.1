package pl.javastart.task;

public class FormaOpodatkowania {

    public double wyliczPodatek(double przychody) {
        double podatek = 0;
        if (przychody <= 10_000) {
            podatek = 0;
        } else if (przychody <= 100_000) {
            podatek = 0.18 * przychody;
        } else if (przychody >= 100_000) {
            podatek = 0.32 * przychody;
        }
        return podatek;
    }
}
