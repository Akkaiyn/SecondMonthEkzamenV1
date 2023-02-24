import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Car h = new Car("Tesla", LocalDate.of(2022, 1,1), 111000, Type.HATCHBACK);
    Car sed = new Car("Toyota", LocalDate.of(2023,1, 2), 200000, Type.SEDAN);
    Car cr = new Car("Benz", LocalDate.of(1995,12, 30), 12000, Type.CROSSOVER);
    Car u = new Car("BMV", LocalDate.of(2015, 10, 30), 100000, Type.UNIVERSAL);

    Car[] cars = {h, sed, cr, u};
        for (Car c: cars) {
            System.out.println(c.toString());;
            c.YearOfManufacture();
            c.bodyTypeIdentification();

        }
    }

}