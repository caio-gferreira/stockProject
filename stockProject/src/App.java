import java.util.List;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.ArrayList;

public class App {
    protected List<Inventory> inventaryProduct = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Inventory invetory = new Inventory();
        App ge = new App();

        invetory.addProductInIventory("PC", "HP", 4.000, 2.00);

        ge.inventaryProduct.add(invetory);

        for (Inventory obj : ge.inventaryProduct) {
            obj.listAllProductsInInventory();
        }
    }
}
