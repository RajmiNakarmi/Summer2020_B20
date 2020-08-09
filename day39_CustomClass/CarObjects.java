package day39_CustomClass;

public class CarObjects {



    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "Toyato";
        car1.model = "Corolla";
        car1.Year = 2020;
        car1.mileage = 20000;
        car1.color = "white";
        car1.price = 190000.50;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.Year);
        System.out.println(car1.mileage);
        System.out.println(car1.color);
        System.out.println(car1.price);

        Car car2 = new Car();
        car2.brand ="BMW";
        car2.model = " G 50";
        car2.color ="Royal Blue";
        car2.Year = 2000;
        car2.mileage = 270000;
        car2.price = 350000;

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.Year);
        System.out.println(car2.mileage);
        System.out.println(car2.color);
        System.out.println(car2.price);
    }

}
