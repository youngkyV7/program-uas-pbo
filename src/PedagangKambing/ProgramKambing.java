package PedagangKambing;

import java.util.ArrayList;

class Kambing {
    private double berat;
    private double tinggi;
    private double panjang;

    public Kambing(double berat, double tinggi, double panjang) {
        this.berat = berat;
        this.tinggi = tinggi;
        this.panjang = panjang;
    }

    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getPanjang() {
        return panjang;
    }
}

class KambingJantan extends Kambing {
    private String jenisKelamin;

    public KambingJantan(double berat, double tinggi, double panjang, String jenisKelamin) {
        super(berat, tinggi, panjang);
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}

class KambingBetina extends Kambing {
    private boolean sedangBunting;

    public KambingBetina(double berat, double tinggi, double panjang, boolean sedangBunting) {
        super(berat, tinggi, panjang);
        this.sedangBunting = sedangBunting;
    }

    public boolean isSedangBunting() {
        return sedangBunting;
    }
}

class PedagangKambing {
    private String nama;
    private ArrayList<Kambing> dataKambing;

    public PedagangKambing(String nama) {
        this.nama = nama;
        this.dataKambing = new ArrayList<>();
    }

    public void tambahDataKambing(Kambing kambing) {
        dataKambing.add(kambing);
    }

    public ArrayList<Kambing> getDataKambing() {
        return dataKambing;
    }
}

public class ProgramKambing {
    public static void main(String[] args) {
        PedagangKambing pakSlamet = new PedagangKambing("Bapak Haji Slamet");

        KambingJantan kambingJantan = new KambingJantan(30.5, 1.2, 0.8, "Jantan");
        KambingBetina kambingBetina = new KambingBetina(40.2, 1.5, 1.0, true);

        pakSlamet.tambahDataKambing(kambingJantan);
        pakSlamet.tambahDataKambing(kambingBetina);

        ArrayList<Kambing> dataKambingPakSlamet = pakSlamet.getDataKambing();

        for (int i = 0; i < dataKambingPakSlamet.size(); i++) {
            Kambing kambing = dataKambingPakSlamet.get(i);
            if (kambing instanceof KambingJantan) {
                KambingJantan kambingJantanInstance = (KambingJantan) kambing;
                System.out.println("Data Kambing Jantan " + (i + 1));
                System.out.println("Berat: " + kambingJantanInstance.getBerat() + " kg");
                System.out.println("Tinggi: " + kambingJantanInstance.getTinggi() + " m");
                System.out.println("Panjang: " + kambingJantanInstance.getPanjang() + " m");
                System.out.println("Jenis Kelamin: " + kambingJantanInstance.getJenisKelamin());
                System.out.println("--------------");
            } else if (kambing instanceof KambingBetina) {
                KambingBetina kambingBetinaInstance = (KambingBetina) kambing;
                System.out.println("Data Kambing Betina " + (i + 1));
                System.out.println("Berat: " + kambingBetinaInstance.getBerat() + " kg");
                System.out.println("Tinggi: " + kambingBetinaInstance.getTinggi() + " m");
                System.out.println("Panjang: " + kambingBetinaInstance.getPanjang() + " m");
                System.out.println("Sedang Bunting: " + kambingBetinaInstance.isSedangBunting());
                System.out.println("--------------");
            }
        }
    }
}
