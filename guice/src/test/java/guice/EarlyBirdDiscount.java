package guice;

public class EarlyBirdDiscount implements Discountable {

	@Override
	public double getDiscount() {
		return .25;
	}
}