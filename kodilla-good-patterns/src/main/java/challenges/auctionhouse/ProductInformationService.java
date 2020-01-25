package challenges.auctionhouse;

public class ProductInformationService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Information send to:" + user);

    }
}
