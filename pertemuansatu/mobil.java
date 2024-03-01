package pertemuansatu;

public class mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;

    public void setNoPlat(String s){
        noPlat = s;
    }
    
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = i;
    }

    public void displayMessage(){
        System.out.println("Mobil anda bermerek: " + manufaktur);
        System.out.println("Nomor plat: " + noPlat);
        System.out.println("Warna: "  + warna);
        System.out.println("Kecepatan: " + kecepatan);
    }
}
