package pro.makagon.data;

import java.util.Objects;

public class Product {
    private final int id;

    public Product(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + id +
                '}';
    }
}
