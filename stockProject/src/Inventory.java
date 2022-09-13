public class Inventory {
    protected Product product = new Product();


    /**
     * @return true if success to add product, else return false
     */
    public boolean addProductInIventory (String productName, String brandName, Double unitPrice, Double amountToAdd) {
        product.productName = productName;
        product.brandName = brandName;
        product.unitPrice = unitPrice;
        product.amountInInventory = amountToAdd;

        return true;
    }

    
    public void listAllProductsInInventory() {
        System.out.println("Name: " + product.productName);
        System.out.println("Brand: " + product.brandName);
        System.out.println("Price: " + product.unitPrice); 
        System.out.println("Amount: " + product.amountInInventory);
    }
}
