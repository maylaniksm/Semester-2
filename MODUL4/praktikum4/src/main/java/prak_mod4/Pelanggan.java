//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package prak_mod4;

import java.util.Objects;

class Pelanggan extends Person implements Membership {
    String memberType;
    String[][] pelanggan = new String[][]{{"Syarif", "pikachu", "Eleanor"}, {"Premium", "Gold", "Silver"}};

    Pelanggan() {
    }

    public Boolean isPelanggan(String namer) {
        for(int i = 0; i < this.pelanggan[0].length; ++i) {
            if (Objects.equals(this.pelanggan[0][i], namer)) {
                this.memberType = this.pelanggan[1][i];
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    public String getMemberType() {
        return this.memberType;
    }

    public float getMembershipDiscount() {
        switch (this.memberType) {
            case "Premium":
                return 0.1F;
            case "Gold":
                return 0.075F;
            case "Silver":
                return 0.05F;
            default:
                return 0.0F;
        }
    }
}
