public class Lingkaran implements BidangDatar{
    private int jarijari;

    

    public Lingkaran(int jarijari) {
        this.jarijari = jarijari;
    }



    @Override
    public double getLuas() {
        return Math.PI * Math.pow(jarijari, 2);
    }



    @Override
    public String toString() {
        return "Lingkaran [ jarijari = " + jarijari + ", luas = " + getLuas() + "]";
    }

    
    
}
