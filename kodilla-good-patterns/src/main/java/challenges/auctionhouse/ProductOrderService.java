package challenges.auctionhouse;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product) {
        System.out.println("I ordered product for user" + user + product);
        return true;
    }
}
