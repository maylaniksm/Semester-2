package codelab;


abstract class Hewan {
    public String suara, hewan;

    public String getHewan() {
        return hewan;
    }

    public void setHewan(String hewan) {
        this.hewan = hewan;
    }

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public abstract void getInfo();

    public abstract void bersuara();
}

interface karnivora {
    public void tampilkanMakanan();

    public void tampilkanJenis();
}

interface herbivora {
    public void tampilkanMakanan();

    public void tampilkanJenis();
}

class Kucing extends Hewan implements herbivora, karnivora {
    public Kucing() {
        setHewan("Kucing");
        setSuara("Meow");
    }

    @Override
    public void tampilkanMakanan() {
        System.out.println("Daging dan ikan");
    }

    @Override
    public void tampilkanJenis() {
        System.out.println("Herbivora dan Karnivora");
    }

    @Override
    public void getInfo() {
        System.out.println("Nama: " + getHewan());
        System.out.print("Jenis: ");
        tampilkanJenis();
        System.out.print("Makanan: ");
        tampilkanMakanan();
        System.out.print("Suara: ");
        bersuara();
    }

    @Override
    public void bersuara() {
        System.out.println(getSuara());
    }
}

class Anjing extends Hewan implements karnivora {
    public Anjing() {
        setHewan("Anjing");
        setSuara("Guk-guk");
    }

    @Override
    public void tampilkanMakanan() {
        System.out.println("Daging");
    }

    @Override
    public void tampilkanJenis() {
        System.out.println("Karnivora");
    }

    @Override
    public void getInfo() {
        System.out.println("Nama: " + getHewan());
        System.out.print("Jenis: ");
        tampilkanJenis();
        System.out.print("Makanan: ");
        tampilkanMakanan();
        System.out.print("Suara: ");
        bersuara();
    }

    @Override
    public void bersuara() {
        System.out.println(getSuara());
    }

}

class Kuda extends Hewan implements herbivora {
    public Kuda() {
        setHewan("Kuda");
        setSuara("hihihihiIIII");
    }

    @Override
    public void tampilkanMakanan() {
        System.out.println("Tumbuhan");
    }

    @Override
    public void tampilkanJenis() {
        System.out.println("Herbivora");
    }

    @Override
    public void getInfo() {
        System.out.println("Nama: " + getHewan());
        System.out.print("Jenis: ");
        tampilkanJenis();
        System.out.print("Makanan: ");
        tampilkanMakanan();
        System.out.print("Suara: ");
        bersuara();
    }

    @Override
    public void bersuara() {
        System.out.println(getSuara());
    }

}

class Beruang extends Hewan implements karnivora {
    public Beruang() {
        setHewan("Beruang");
        setSuara("Grrrrr");
    }

    @Override
    public void tampilkanMakanan() {
        System.out.println("Daging");
    }

    @Override
    public void tampilkanJenis() {
        System.out.println("Karnivora");
    }

    @Override
    public void getInfo() {
        System.out.println("Nama: " + getHewan());
        System.out.print("Jenis: ");
        tampilkanJenis();
        System.out.print("Makanan: ");
        tampilkanMakanan();
        System.out.print("Suara: ");
        bersuara();
    }

    @Override
    public void bersuara() {
        System.out.println(getSuara());
    }

}

public class main {
    public static void main(String[] args) {
    Kucing tio = new Kucing();
    Anjing ajg = new Anjing();
    Kuda horse = new Kuda ();
    Beruang bear = new Beruang();
    tio.getInfo();
    System.out.println("");
    ajg.getInfo();
    System.out.println("");
    horse.getInfo();
    System.out.println("");
    bear.getInfo();
        
    }
    
    
}