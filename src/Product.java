import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private int price;
    private ArrayList<Integer> boughtBy = new ArrayList<Integer>();

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }



    public ArrayList<Integer> getBoughtBy() {
        return boughtBy;
    }

    public void addBoughtBy(Integer integer) {
        this.boughtBy.add(integer);
    }

}

