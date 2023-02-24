
import java.time.LocalDate;
import java.time.Period;

public class Car implements Method {
    private String model;
    private LocalDate year;
    private int price;
    private   Type type;

    public Car(String model, LocalDate year, int price, Type type) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
        public void YearOfManufacture () {
            System.out.println(Period.between(getYear(), LocalDate.now()).getYears() + "years");
        }



    @Override
    public void bodyTypeIdentification() {
        switch (getType()){
            case SUV -> System.out.println("It is a SUV car");
            case SEDAN -> System.out.println("It is a light car");
            case CROSSOVER -> System.out.println("It is a SUV  car");
            case UNIVERSAL -> System.out.println("It is a universal car");
            case HATCHBACK -> System.out.println("It is a light  car");
        }}
        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    ", type=" + type +
                    '}';
        }



    }

