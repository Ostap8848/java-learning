package shopsimulation;

import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private String shopTitle;
    private List<Product> products;
    private List<Product> soldProducts;

    public Shop(String shopTitle) {
        this.shopTitle = shopTitle;
        this.products = new ArrayList<>();
        this.soldProducts = new ArrayList<>();
    }

    public void fillDefaultProducts() {
        Product bread = new Product("bread", 22.3, 15);
        Product vodka = new Product("vodka", 75, 0);
        Product sausage = new Product("sausage", 61.45, 2);
        Product cola = new Product("cola", 32.5, 0);
        Product salt = new Product("salt", 20.0, 0);
        Product mayonnaise = new Product("mayonnaise", 24.3, 6);
        Product rice = new Product("rice", 45.2, 0);
        Product matches = new Product("matches", 2.5, 1);
        Product chocolate = new Product("chocolate", 25, 0);
        Product oil = new Product("oil", 65.3, 25);
        products = Arrays.asList(bread, vodka, sausage, cola, salt,
                mayonnaise, matches, rice, chocolate, oil);
    }

    public Product findProduct(String title) {
        return products.stream()
                .filter(product -> title.equalsIgnoreCase(product.getTitle()))
                .findAny()
                .orElse(null);
    }

    public void showBill(List<Product> productsToSell) {
        double totalPrice = 0;
        List<Product> prepareToBill = prepareFinalPrice(productsToSell);
        System.out.println("\n\nYour products list : ");
        totalPrice = prepareToBill.stream().mapToDouble(Product::getPrice).sum();
        prepareToBill.forEach(System.out::println);
        System.out.println("Total price is : " + totalPrice);
    }

    private List<Product> prepareFinalPrice(List<Product> productsToSell) {
        return  products.stream()
                .distinct()
                .filter(productsToSell::contains)
                .map(product ->
                        new Product(product.getTitle(), calculatePriceWithDiscount(product), product.getDiscount()))
                .collect(Collectors.toList());
    }

    public void showAllProducts() {
        products.forEach(System.out::println);
    }

    public double calculatePriceWithDiscount(Product product) {
        return product.getPrice() - (product.getPrice() * product.getDiscount() / 100);
    }

    public void sell(List<Product> wishList, Person person) {
        double totalPrice = 0;
        if (person.getMoney() > 0) {
            List<Product> toSell = prepareFinalPrice(wishList);
            totalPrice = toSell.stream().mapToDouble(Product::getPrice).sum();
            if (person.getMoney() > totalPrice) {
                System.out.println("This is your products, have a nice day " + person.getName());
                person.setMoney(person.getMoney() - totalPrice);
                soldProducts.addAll(toSell);
                System.out.println("Your rest is : " + person.getMoney());
            } else {
                System.out.println("Go fuck yourself drunk idiot");
            }
        }
    }


    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String title) {
        this.shopTitle = title;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(List<Product> soldProducts) {
        this.soldProducts = soldProducts;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopTitle='" + shopTitle + '\'' +
                '}';
    }
}
