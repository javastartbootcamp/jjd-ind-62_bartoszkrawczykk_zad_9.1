package pl.javastart.task;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private double sumaWplywow;
    private double sumaWydatkow;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania, double sumaWplywow, double sumaWydatkow) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
        this.sumaWplywow = sumaWplywow;
        this.sumaWydatkow = sumaWydatkow;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", "TODO");
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow));
        System.out.print("\n\n");
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public FormaOpodatkowania getFormaOpodatkowania() {
        return formaOpodatkowania;
    }

    public void setFormaOpodatkowania(FormaOpodatkowania formaOpodatkowania) {
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public double getSumaWplywow() {
        return sumaWplywow;
    }

    public void setSumaWplywow(double sumaWplywow) {
        this.sumaWplywow = sumaWplywow;
    }

    public double getSumaWydatkow() {
        return sumaWydatkow;
    }

    public void setSumaWydatkow(double sumaWydatkow) {
        this.sumaWydatkow = sumaWydatkow;
    }

    public void dodajPrzychod(double sumaWplywow) {
        // TODO
    }

    public void dodajWydatek(double sumaWydatkow) {
        // TODO
    }
}