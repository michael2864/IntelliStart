import java.util.ArrayList;



public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int amountOfMoney;
    private ArrayList <Integer> userBoughtTheseProductsId = new ArrayList<Integer>();

    public User(int id, String firstName, String lastName, int amountOfMoney) {


        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getUserBoughtTheseProductsId() {

        return userBoughtTheseProductsId;
    }


    public void addBoughtProductsWithId(Integer newProductId) {
        userBoughtTheseProductsId.add(newProductId);
    }
}
