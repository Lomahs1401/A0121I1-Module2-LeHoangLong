package product;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name of product: " + this.getName()
                + ", ID of product: " + this.getId();
    }

    @Override
    //Sắp xếp theo thứ tự id tăng dần
    public int compareTo(Product o) {
        if (this.getId() > o.getId()) {
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        } else return 0;
    }
}
