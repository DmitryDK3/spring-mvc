package web.model;

public class Car {
    private String model;
    private String series;
    private int price;

    public Car(String model, String series, int price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", price=" + price +
                '}';
    }
}
