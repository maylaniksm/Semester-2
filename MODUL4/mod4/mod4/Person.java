package mod4;

import java.util.Objects;

public abstract class Person{
    private String name;

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
}
class Pelanggan extends Person implements Membership{
    String memberType;
    String[][] pelanggan = {{"Syarif","pikachu","Eleanor"}, {"Premium","Gold","Silver"}};

    public Boolean isPelanggan(String namer) {
        for (int i = 0; i < pelanggan[0].length; i++) {
            if (Objects.equals(pelanggan[0][i], namer)) {
                this.memberType = pelanggan[1][i];
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public String getMemberType() {
        return memberType;
    }

    @Override
    public float getMembershipDiscount() {
        switch (memberType) {
            case "Premium" -> {
                return 0.1F;
            }
            case "Gold" -> {
                return 0.075F;
            }
            case "Silver" -> {
                return 0.05F;
            }
            default -> {
                return 0;
            }
        }
    }
}
class Karyawan extends Person implements Membership{
    float discount = 0.125F;

    @Override
    public float getMembershipDiscount() {
        return discount;
    }
}
interface Membership{
    public float premium_disc = 0.1F, gold_disc = 0.075F, silver_disc = 0.05F;
    float getMembershipDiscount();
}