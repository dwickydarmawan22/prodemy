import java.time.LocalDateTime;

public class DateUtil {
    static private String[] hari = new String[] {"Minggu", "Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu"};
    static private String[] bulan = new String[] {"Januari", "Februari", "Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};

    public static String getInfoHari(){
        LocalDateTime hariIni = LocalDateTime.now();
        String infoHari = hari[hariIni.getDayOfWeek().getValue()] + ", " + hariIni.getDayOfMonth() + " " + bulan[hariIni.getMonthValue() -1] + " " + hariIni.getYear();
        return infoHari;
    }
}
