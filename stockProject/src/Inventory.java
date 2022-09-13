public class Inventory {
    Product product = new Product();

    /**
     * @return true if success to add product else return false
     */
    public boolean addProductInIventory (String productName, String brandName, Double unitPrice, Integer amountToAdd) {
        // if has validate value return true
        if (amountToAdd > 0 || productName != null || unitPrice > 0.0)  {
            product.productName = productName;
            product.brandName = brandName;
            product.unitPrice = unitPrice;
            product.amountInInventory = amountToAdd;
            product.codeProduct = "b2fe6582-e6d2-4c97-abb7-d036f6557eb4";

            return true;
        }

        // otherwise return false
        return false;
    }

    public boolean saleProduct (String codeProduct, Integer amountToSale) {
        Double saleValue = 0.0;
        if (codeProduct == product.codeProduct) {
            product.amountInInventory -= amountToSale;
            
            for (Integer obj = amountToSale; obj > 0; obj--) {
                saleValue = product.unitPrice + product.unitPrice;
            }
            System.out.println("Total: R$" + saleValue);
        
            return true;
        }

        return false;
    }

    /**
     * @return all that exist in inventary
     */
    public String listInventory() {
        return "Name: " + product.productName + "\nBrand: " + product.brandName + "\nPrice: R$" + product.unitPrice + "\nAmount: " + product.amountInInventory + "\nCod: " + product.codeProduct;
    }
}
