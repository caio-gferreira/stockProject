import java.util.List;
import java.util.ArrayList;

public class App {
    protected List<Inventory> inventaryProduct = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Inventory invetory = new Inventory();
        System.out.println("=================================Estoque==========================================");
        invetory.addProductInIventory("PC", "HP", 4000.00, 2);
        System.out.println(invetory.listInventory());
        System.out.println("=================================Venda============================================");
        invetory.saleProduct("b2fe6582-e6d2-4c97-abb7-d036f6557eb4", 1);

        System.out.println("=================================Estoque Atualizado===============================");
        System.out.println(invetory.listInventory());
    }
}
