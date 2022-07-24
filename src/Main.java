public class Main {
    public static void main(String[] args) {
        MenuFunctions mn = new MenuFunctions();
        mn.addProduct(new Product(2, "tt1", 200));
        mn.addProduct(new Product(3, "tt2", 300));
        mn.addProduct(new Product(4, "tt3", 400));

        mn.DisplayAllProducts();

        mn.addUser(new User(2,"John","Doe",1000));
        mn.addUser(new User(3,"J","D",800));
        mn.addUser(new User(4,"Dj","JJJJJJ",1000));

        mn.DisplayAllUsers();






    }
}
