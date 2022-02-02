package shopsimulation;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {

        Person customer = new Person("Orko", 33, 202, true);
        Person customerRich = new Person("Peter", 13, 402, false);
        Shop shop = new Shop("Dzhmil");
        shop.fillDefaultProducts();
        Scanner sc = new Scanner(System.in);
        Person customerCustom = new Person();
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter your cash : ");
        double money = sc.nextDouble();
        System.out.println("Are you drunk?  : ");
        boolean isDrunk = sc.nextBoolean();
        customerCustom.setName(name);
        customerCustom.setAge(age);
        customerCustom.setMoney(money);
        customerCustom.setDrunk(isDrunk);
        System.out.println("Welcome to " + shop.getShopTitle() + " shop, " + customerCustom.getName());
        shop.showAllProducts();

       /* customer.getWishList().add(shop.findProduct("vodka"));
        customer.getWishList().add(shop.findProduct("sausage"));
        customer.getWishList().add(shop.findProduct("cola"));
        customer.getWishList().add(shop.findProduct("chocolate"));

        customerRich.getWishList().add(shop.findProduct("vodka"));
        customerRich.getWishList().add(shop.findProduct("cola"));*/
        System.out.println("Enter product title : ");
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            customerCustom.getWishList().add(shop.findProduct(input));
        }

        shop.showBill(customerCustom.getWishList());
        shop.sell(customerCustom.getWishList(), customerCustom);

        shop.getSoldProducts().forEach(System.out::println);

        /*shop.sell(customer.getWishList(), customer);
        shop.sell(customerRich.getWishList(), customerRich);*/
        customerRich.setDrunk(true);


    }
}
