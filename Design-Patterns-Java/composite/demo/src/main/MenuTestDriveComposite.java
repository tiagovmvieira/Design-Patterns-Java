package main;

public class MenuTestDriveComposite {

    public static void main(String[] args){

        MenuComponent pancakeHouseMenu = new MenuComposite("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new MenuComposite("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new MenuComposite("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new MenuComposite("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new MenuComposite("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItemComposite(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99
        ));
        pancakeHouseMenu.add(new MenuItemComposite(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99
        ));
        pancakeHouseMenu.add(new MenuItemComposite(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49
        ));
        pancakeHouseMenu.add(new MenuItemComposite(
                "Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59
        ));

        dinerMenu.add(new MenuItemComposite(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99
        ));
        dinerMenu.add(new MenuItemComposite(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99
        ));
        dinerMenu.add(new MenuItemComposite(
                "Soup of the day",
                "A bowl of the soup of the day, with a side of potato salad",
                false,
                3.29
        ));
        dinerMenu.add(new MenuItemComposite(
                "Hot Dog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false,
                3.05
        ));
        dinerMenu.add(new MenuItemComposite(
                "Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice",
                true,
                3.99
        ));
        dinerMenu.add(new MenuItemComposite(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItemComposite(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));
        dessertMenu.add(new MenuItemComposite(
                "Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99
        ));
        dessertMenu.add(new MenuItemComposite(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89
        ));

        cafeMenu.add(new MenuItemComposite(
                "Veggie Burguer and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99
        ));
        cafeMenu.add(new MenuItemComposite(
                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69
        ));
        cafeMenu.add(new MenuItemComposite(
                "Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29
        ));

        WaitressComposite waitress = new WaitressComposite(allMenus);

        waitress.printMenu();

    }
}
