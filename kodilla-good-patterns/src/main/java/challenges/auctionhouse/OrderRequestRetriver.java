package challenges.auctionhouse;

public class OrderRequestRetriver {
    public OrderRequest retrive () {
        User user = new User("John", "Smith");
        Product product = new Product("Product",2);

        return new OrderRequest(user,product);
    }
}
