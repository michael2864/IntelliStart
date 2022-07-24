public class MenuFunctions {
    void DisplayAllUsers () {
        System.out.println(Storage.users);
    }
    void DisplayAllProducts () {
        System.out.println(Storage.products);
    }
    void DisplayProductsById () {

    }
    void BuyProduct (int userId, int productId) throws Exception {
        if (Storage.users.get(userId).getAmountOfMoney()<Storage.products.get(productId).getPrice()){
            throw new Exception  ("Insufficient funds");
        } else {
            int money = Storage.users.get(userId).getAmountOfMoney();
            Storage.users.get(userId).setAmountOfMoney(money - Storage.products.get(productId).getPrice());
            Storage.users.get(userId).addBoughtProductsWithId(productId);
            Storage.products.get(productId).addBoughtBy(userId);
            System.out.println("Product bought successfully");
        }
    }
    void DisplayProductByUserId (Integer id) {
        System.out.println("This users had bought these products:   ");
        Storage.users.get(id).getUserBoughtTheseProductsId();
    }

    void DisplayUserByProductId (Integer id) {
        System.out.println("This product was bought by these users:  ");
        Storage.products.get(id).getBoughtBy();
    }
    void addUser (User user) {
        Storage.AddUser(user);
    }
    void addProduct (Product product) {
        Storage.AddProduct(product);
    }

    void deleteUser (Integer id) {

    }

    void deleteProduct (Integer id) {

    }

}
