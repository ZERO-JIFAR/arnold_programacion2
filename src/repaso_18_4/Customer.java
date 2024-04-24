package repaso_18_4;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String lastName;
    private ArrayList cart;

    public Customer(String name, String lastName, ArrayList cart) {
        this.name = name;
        this.lastName = lastName;
        this.cart = cart;
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

    public ArrayList getCart() {
        return cart;
    }

    public void setCart(ArrayList cart) {
        this.cart = cart;
    }
}
