package pe.edu.utp.iac.accesible.internal;

import java.util.Objects;

public class Mouse implements Hardware{
    private String brand;
    private float price;

    public Mouse(String brand, float price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mouse mouse)) return false;
        return Float.compare(getPrice(), mouse.getPrice()) == 0 && Objects.equals(getBrand(), mouse.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getPrice());
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getSerial() {
        return "SN000";
    }

    @Override
    public String getName() {
        return this.brand;
    }

    @Override
    public int getColor() {
        return 0;
    }
}
