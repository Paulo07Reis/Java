package poo.exercise.exercise23;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double totalValue(){
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product: ").append(name);
        sb.append(", price: ").append(String.format("%.2f", price));
        sb.append(", quantity: ").append(quantity);
        sb.append(", stock value: ").append(String.format("%.2f", totalValue()));
        return sb.toString();
    }
}