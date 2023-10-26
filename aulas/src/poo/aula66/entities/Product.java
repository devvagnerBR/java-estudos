package poo.aula66.entities;

public class Product {

    public String name;
    public Double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "produto: " + name
                + ", " + "valor: R$"
                + String.format("%.2f", price)
                + ", " + "unidades: "
                + quantity
                + ", " + "valor total: R$"
                + String.format("%.2f", totalValueInStock());
    }
}
