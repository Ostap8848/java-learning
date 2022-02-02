package shopsimulation;

public class Product {
    private String title;
    private double price;
    private int discount;

    public Product () {}

    public Product (String title, double price, int discount) {
        this.title = title;
        this.price = price;
        this.discount = discount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + String.format("%.2f", price) +
                ", discount=" + discount +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (Double.compare(product.getPrice(), getPrice()) != 0) return false;
        if (getDiscount() != product.getDiscount()) return false;
        return getTitle() != null ? getTitle().equals(product.getTitle()) : product.getTitle() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getTitle() != null ? getTitle().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getDiscount();
        return result;
    }
}

