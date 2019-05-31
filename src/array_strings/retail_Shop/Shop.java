package array_strings.retail_Shop;

import java.util.Scanner;

public class Shop {
    private String shopName, shopAddress, products[];

    public Shop(String shopName, String shopAddress, String[] products) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.products = products;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }
    boolean checkProductAvailability(String productname){
        for(int i = 0 ; i < products.length; i++){
            String[] prod = getProducts();
            if(prod[i].equals(productname)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the shopname:");
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        System.out.println("Enter the address:");
        String  address = scanner.nextLine();
        System.out.println("Enter the no of products");
        int n = scanner.nextInt();
        if(n<=0){
            return;
        }
        scanner.nextLine();
        String[] pr = new String[n];
        for(int i = 0 ; i <n ; i++  )
            pr[i] = scanner.nextLine();

        String pto = scanner.nextLine();
        Shop shop = new Shop(name,address,pr);
        if(shop.checkProductAvailability(pto)){
            System.out.println("Product is available at "+ shop.getShopName()+ ", "+
                    shop.getShopAddress());
        }
        else
            System.out.println("Product is not available at "+ shop.getShopName()+ ", "+
                    shop.getShopAddress());



    }
}
