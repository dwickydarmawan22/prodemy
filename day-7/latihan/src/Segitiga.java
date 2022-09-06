public class Segitiga implements BidangDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double getLuas() {
        return (alas*tinggi)/2;
    }

    @Override
    public String toString() {
        return "Segitiga [ alas = " + alas + ", tinggi = " + tinggi + ", luas = " + getLuas() + " ]";
    }

    
    
}
