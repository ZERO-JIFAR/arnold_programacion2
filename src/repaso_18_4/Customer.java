package repaso_18_4;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String lastName;
    private ArrayList<Product> cart;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.cart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    // Metodo para agregar un producto al carrito
    public void addCart(Product product) {
        cart.add(product);
    }

    // Metodo para calcular el total de la compra
    public double totalPurchase() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
    public void seeCustomer(){
        System.out.println("El cliente: "+getName()+" "+getLastName());
        System.out.println("Compro: ");
        for (Product product : cart) {
            System.out.println(product.getName() + " ______ $" + product.getPrice());
        }
    }
}
