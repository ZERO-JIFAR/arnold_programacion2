package repaso_18_4;
import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Product> inventory;

    public Supermarket() {
        this.inventory = new ArrayList<>();
    }

    // Metodo para añadir un nuevo producto al inventario
    public void addProduct(Product product){
        inventory.add(product);
    }

    // Metodo para buscar un producto por nombre
    public Product searchProduct(String name){
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null; // Si el producto no se encuentra en el inventario
    }

    // Metodo para que un cliente realice una compra
    public void makePurchase(Customer customer) {
        for (Product product : customer.getCart()) {
            Product productInventory = searchProduct(product.getName());
            if (productInventory != null && productInventory.getStock() > 0) {
                productInventory.setStock(productInventory.getStock() - 1);
            } else {
                System.out.println("El producto " + product.getName() + " no esta disponible en el inventario.");
            }
        }
        customer.getCart().clear(); // Vaciar el carrito despues de la compra
    }

    // Metodo para imprimir la lista de productos disponibles en el inventario
    public void showInventory() {
        System.out.println("Inventario del Supermercado");
        for (Product product : inventory) {
            product.seeProduct();
            System.out.println("-----------------------");
        }
    }
}
