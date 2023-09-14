package mod4;

public abstract class Item {
    private String brand, model;
    private int price, stock;
    private float discount;
    private Boolean onSale;

    public void setBrand(String brand){this.brand = brand;}
    public String getBrand(){return brand;}

    public void setModel(String model){this.model = model;}
    public String getModel(){return model;}

    public void setPrice(int price){this.price = price;}
    public int getPrice(){
        if(getOnSale() == Boolean.TRUE){
            return (int) (this.price - (this.price * getDiscount()));
        }else {
            return this.price;
        }
    }

    public void setStock(int stock){this.stock = stock;}
    public int getStock(){return stock;}

    public void setDiscount(float discount){this.discount = discount;}
    public float getDiscount(){return discount;}

    public void setOnSale(Boolean onSale){this.onSale = onSale;}
    public Boolean getOnSale(){return onSale;}

}
interface AlatElektronik{
    double max_disc = 0.20;

}
interface AlatMusik{
    double max_disc = 0.15;
}

class Gitar extends Item implements AlatMusik{
    Gitar() {
        setOnSale(Boolean.FALSE);
        setDiscount(0.1F);
        setBrand("YAMAHA");
        setModel("2022");
        setPrice(1000000);
        setStock(100);

    }
}
class GitarElektrik extends Item implements AlatMusik,AlatElektronik{
    GitarElektrik() {
        setOnSale(Boolean.TRUE);
        setDiscount(0.15F);
        setBrand("MIXUE");
        setModel("V12");
        setPrice(2000000);
        setStock(65);

    }
}