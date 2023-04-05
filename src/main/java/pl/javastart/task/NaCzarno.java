package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {


    @Override
    public double wyliczPodatek(double przychody) {
        double podatek = 0;
        if (przychody > 0) {
            podatek = 0.15 * przychody;
        }
        return podatek;
    }
}
