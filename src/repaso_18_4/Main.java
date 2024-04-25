
package repaso_18_4;
public class Main {
    public static void main(String[] args) {
    Product producto1 = new Product("Arroz", 25.99, 50);
    Product producto2 = new Product("Leche", 15.99, 100);
    Product producto3 = new Product("Pan", 10, 80);

    // Crear supermercado y agregar productos al inventario
    Supermarket supermarket = new Supermarket();
        supermarket.addProduct(producto1);
        supermarket.addProduct(producto2);
        supermarket.addProduct(producto3);

    // Crear cliente
    Customer customer = new Customer("Juan", "Perez");

    // Agregar productos al carrito del cliente
    customer.addCart(producto1);
    customer.addCart(producto2);

    // Datos del cliente
    customer.seeCustomer();

    // Realizar compra
    supermarket.makePurchase(customer);

    System.out.println("");

    // Mostrar inventario después de la compra
    supermarket.showInventory();

    }
}