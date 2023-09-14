public class demoConv {
    static int convCM(){
        return 1 * 100;
    }
    static int convMM(){ //static bisa langsung mengeksekusi
        return 1 * 1000;
    }
    static void dispConv(){ //void tidak ada nilai kembalian
        System.out.println("1 Meter = " + convCM() + " cm, " + convMM() + " mm");
    }
    public static void main(String[] args){
        dispConv();
    }
}
