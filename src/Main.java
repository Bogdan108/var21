public class Main {
    public static void main(String[] args) {

        Shop AudiCentre = new carShop();
        AudiCentre.sellItems(new ConcreteVisitor());
        Shop X5Retail = new productShop();
        X5Retail.sellItems(new ConcreteVisitor());
    }
}

interface Shop {
    void sellItems(Visitor realization);
}

class carShop implements Shop {

    @Override
    public void sellItems(Visitor realization) {
        realization.sellCars();
    }
}

class productShop implements Shop {

    @Override
    public void sellItems(Visitor realization) {
        realization.sellProducts();
    }
}

interface Visitor {
    void sellCars();

    void sellProducts();
}

class ConcreteVisitor implements Visitor {

    @Override
    public void sellCars() {
        System.out.println("Продажа автомобилей\n");
    }

    @Override
    public void sellProducts() {
        System.out.println("Продажа продуктов питания\n");
    }
}