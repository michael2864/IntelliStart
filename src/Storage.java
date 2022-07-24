import java.util.ArrayList;

public class Storage {
    public static ArrayList <User> users = new ArrayList <> ();
    public static ArrayList <Product> products = new ArrayList <> ();
    private int userCounter=0;
    private int productCounter=0;

    public static void AddUser (User user) {
        user.setId(users.size()-1);
        users.add(user);

    }

    public static void AddProduct (Product product) {
        product.setId(products.size()-1);
        products.add(product);

    }

}
