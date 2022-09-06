public class Persegi implements BidangDatar{
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public String toString() {
        return "Persegi [ sisi = " + sisi + ", Luas = " + getLuas() + " ]";
    }

    
    
    
}
