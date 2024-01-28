package org.example;

public class Program  {
    public static void main(String[] args) {
        Product milk = new Product("milk", 65.99, (int) 8);
        Product meat = new Product("meat", 335.99, (int) 3);
        Product veg = new Product("veg", 105.99, (int) 6);

        Category dairy = new Category("dairy", new Product[]{milk, meat});
        Category meats = new Category("meats", new Product[]{meat});
        Category vegetable = new Category("vegetable", new Product[]{veg});

        Basket basket1 = new Basket(new Product[]{milk});
        Basket basket2 = new Basket(new Product[]{meat});
        Basket basket3 = new Basket(new Product[]{veg});

        User Ivan = new User("Ivan", "123", basket1);
        User Oleg = new User("Oleg", "456", basket2);
        User Nik = new User("Nik", "789", basket3);

        System.out.println("Catalog of products:");

        for (Product product : dairy.products) {
            System.out.println(STR."\{product.getName()} - \{product.getPrice()} - \{product.getRating()}");
        }

        for (Product product : meats.products) {
            System.out.println(STR."\{product.getName()} - \{product.getPrice()} - \{product.getRating()}");
        }

        for (Product product : vegetable.products) {
            System.out.println(STR."\{product.getName()} - \{product.getPrice()} - \{product.getRating()}");
        }

        System.out.println("\nPurchases of users: ");

        if (Ivan.getBasket() != null && Ivan.getBasket().purchasedProducts != null) {
            for (Product product : Ivan.getBasket().purchasedProducts) {
                System.out.println(STR."\{Ivan.getLogin()} - \{product.getName()}");
            }
        }

        if (Oleg.getBasket() != null && Oleg.getBasket().purchasedProducts != null) {
            for (Product product : Oleg.getBasket().purchasedProducts) {
                System.out.println(STR."\{Oleg.getLogin()} - \{product.getName()}");
            }
        }
        if (Nik.getBasket() != null && Nik.getBasket().purchasedProducts != null) {
            for (Product product : Nik.getBasket().purchasedProducts) {
                System.out.println(STR."\{Nik.getLogin()} - \{product.getName()}");
            }
        }
    }
}