package model;

public class Matakuliah {
    int idmatakuliah;
    String namaMatakuliah;
    String singkatanMatakuliah;
    String namaDosen;
    String kontakDosen;

    public int getIdmatakuliah() {
        return idmatakuliah;
    }

    public void setIdmatakuliah(int matakuliah) {
        this.idmatakuliah = matakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public String getSingkatanMatakuliah() {
        return singkatanMatakuliah;
    }

    public void setSingkatanMatakuliah(String singkatanMatakuliah) {
        this.singkatanMatakuliah = singkatanMatakuliah;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public Matakuliah(int matakuliah, String namaMatakuliah, String singkatanMatakuliah, String namaDosen, String kontakDosen, boolean aktif) {
        this.idmatakuliah = matakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.singkatanMatakuliah = singkatanMatakuliah;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    boolean aktif;
}
