package challenges.auctionhouse;

public class ProductOrderRepository implements OrderRepository {
    public void createOrder(User user, Product product){
        System.out.println("Product ordered for: " + user);
    }
}
