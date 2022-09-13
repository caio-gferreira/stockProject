import java.util.ArrayList;
import java.util.List;
public class Inventory {
    private List<Product> productList;
    public Inventory() {
        this.productList = new ArrayList<>();
    };

    /**
     * @return true if success to add product else return false
     */
    public boolean setProductInInvetory (String productName, String brandName, Double unitPrice, Integer amountToAdd, String codeProduct) {
        Product product = new Product();
        // if has validate value return true
        if (amountToAdd > 0 || productName != null || unitPrice > 0.0)  {
            product.productName = productName;
            product.brandName = brandName;
            product.unitPrice = unitPrice;
            product.amountInInventory = amountToAdd;
            product.codeProduct = codeProduct;

            this.productList.add(product);
            System.out.println("Produto adicionado!");
            return true;
        }

        // otherwise return false
        System.out.println("Erro ao adicionar o produto!");
        return false;
    }

    /**
     * @return true if success to sale product else return false
     */
    public boolean saleProduct (String codeProduct, Integer amountToSale) {
        for (Product product : this.productList) {
            Double saleValue = 0.0;
            // has code product
            if (codeProduct.equals(product.codeProduct)) {
                if (product.amountInInventory >= amountToSale) {

                    product.amountInInventory -= amountToSale;
                    saleValue = product.unitPrice * amountToSale;
                    System.out.println("Total: R$" + saleValue);
                    return true;
                } else {
                    System.out.println("Quantidade insuficiente!");
                    return false;
                } 
            } else {
                System.out.println("Produto NÃO Encontrado!");
            }
        }

        return false;
    }

    public void getInvetory() {
        for (Product obj : this.productList) {
            System.out.println("Name: " + obj.productName + "\nBrand: " + obj.brandName + "\nPrice: R$" + obj.unitPrice + "\nAmount: " + obj.amountInInventory + "\nCod: " + obj.codeProduct);
            System.out.println("\n=====================================================================================================================================================================");
        }
    }
}
