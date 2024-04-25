package repaso_18_4;
public class Product {
    private String name;
    private double  price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Metodo para mostrar el stock
    public void seeProduct(){
        System.out.println("Producto: "+getName()+"\n"+"$"+getPrice()+"\n"+"Stock: "+getStock());
    }
}
