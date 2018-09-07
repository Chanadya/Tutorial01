public class Mahasiswa {
    String nama;
    String npm;
    int semester;

    public Mahasiswa(String nama, String npm, int semester) {
        this.nama = nama;
        this.npm = npm;
        this.semester = semester;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
