import java.util.regex.Pattern;

public class Mahasiswa {

    private String nama;
    private String NIM;
    private String email;

    private void cekNama(String nama) throws NamaFormatException {
        Pattern namaPattern = Pattern.compile("[A-Za-z]+");
        if (!namaPattern.matcher(nama).matches()) {
            throw new NamaFormatException("Nama harus berupa huruf alfabet saja");
        }
    }

    private void cekNIM(String NIM) throws NIMFormatException {
        Pattern nimPattern = Pattern.compile("10370311\\d{7}");
        if (!nimPattern.matcher(NIM).matches()) {
            throw new NIMFormatException("NIM tidak valid\n          NIM harus dimulai dengan 10370311+7 digit");
        }
    }

    private void cekEmail(String email) throws EmailFormatException {
        Pattern emailPattern = Pattern.compile(
                "^[\\w!#$%&amp;'+/=?`{|}^-]+(?:\\.[\\w!#$%&amp;'+/=?`{|}^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        if (!emailPattern.matcher(email).matches()) {
            throw new EmailFormatException("Format email tidak valid");
        }
    }

    public void setNIM(String NIM) throws NIMFormatException {
        cekNIM(NIM);
        this.NIM = NIM;
    }

    public void setNama(String nama) throws NamaFormatException {
        cekNama(nama);
        this.nama = nama;
    }

    public void setEmail(String email) throws EmailFormatException {
        cekEmail(email);
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println("Data diri mahasiswa:");
        System.out.println("Nama    : " + getNama());
        System.out.println("NIM     : " + getNIM());
        System.out.println("Email   : " + getEmail());
    }
}
