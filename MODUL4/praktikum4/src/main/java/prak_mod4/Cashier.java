//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package prak_mod4;

public class Cashier {
    Karyawan karyawan = new Karyawan();
    Pelanggan pelanggan = new Pelanggan();
    float currentPrice;
    float currentDiscount = 0.0F;
    float total;
    float memberDiscount;
    String name = "";
    String memberType = "Tidak ada";

    public Cashier() {
    }

    float getTotal() {
        this.total = this.currentPrice - this.currentPrice * this.currentDiscount;
        return this.total;
    }

    void setPrice(float price) {
        this.currentPrice += price;
    }

    void setDisc(float disc) {
        this.currentDiscount = Float.sum(this.currentDiscount, disc);
    }

    String getMemberType() {
        return this.memberType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMembershipDiscount() {
        return this.memberDiscount;
    }

    public void isKaryawan() {
        this.setDisc(this.karyawan.getMembershipDiscount());
        this.memberDiscount = this.karyawan.getMembershipDiscount();
    }

    public Boolean isMember() {
        if (this.pelanggan.isPelanggan(this.name) == Boolean.TRUE) {
            this.memberType = this.pelanggan.getMemberType();
            this.setDisc(this.pelanggan.getMembershipDiscount());
            this.memberDiscount = this.pelanggan.getMembershipDiscount();
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
