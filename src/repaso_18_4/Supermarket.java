package repaso_18_4;
import java.util.ArrayList;

public class Supermarket {
    private ArrayList inventory;

    public Supermarket(ArrayList inventory) {
        this.inventory = inventory;
    }

    public ArrayList getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList inventory) {
        this.inventory = inventory;
    }
}
