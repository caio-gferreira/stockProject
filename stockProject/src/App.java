import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    List<Product> productList;
    // public App() {
    //     this.productList = new ArrayList<>();
    // };
    public static void main(String[] args)  {
  
        App app = new App();
        app.productList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String option, productName, brandName, codeProduct, unitPrice, amountToAdd;
        Inventory invetory = new Inventory();
        
        do {
            app.showMenu();
            option = sc.nextLine();
            

            switch (Integer.parseInt(option)) {
                case 1:
                System.out.println("\n=====================================================================================================================================================================");
                    System.out.println("Cadastro de produto\n\n");

                    System.out.println("Nome do produto: ");
                    productName = sc.nextLine();

                    System.out.println("Marca do produto: ");
                    brandName = sc.nextLine();

                    System.out.println("Código do produto: ");
                    codeProduct = sc.nextLine();

                    System.out.println("Preço unitário do produto: ");
                    unitPrice = sc.nextLine();

                    System.out.println("Quantidade: ");
                    amountToAdd = sc.nextLine();

                    invetory.setProductInInvetory(productName, brandName, Double.parseDouble(unitPrice), Integer.parseInt(amountToAdd), codeProduct);
                    break;
                case 2:
                System.out.println("\n=====================================================================================================================================================================");
                    System.out.println("Busca de produto\n\n");
                    invetory.getInvetory();
                    break;
                case 3:
                System.out.println("\n=====================================================================================================================================================================");
                    System.out.println("Venda de produto");;

                    System.out.println("Código do produto: ");
                    codeProduct = sc.nextLine();

                    System.out.println("Quantidade: ");
                    amountToAdd = sc.nextLine();

                    invetory.saleProduct(codeProduct, Integer.parseInt(amountToAdd));
                    break;
                case 4:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Error");
            }
        } while(Integer.parseInt(option) < 4);
    }

    public void showMenu() {
        System.out.println("1) Cadastro de Produto");
        System.out.println("2) Buscar produto");
        System.out.println("3) Venda de produto");
        System.out.println("4) Sair");
    }
}
