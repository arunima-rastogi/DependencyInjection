package guice;

import com.google.inject.Inject;

public class CheckoutService {

	private final Discountable discountable;

	@Inject
	public CheckoutService(Discountable obj) {
		this.discountable = obj;
	}

	public double checkout(double shoppingCartVal) {
		double totoal = shoppingCartVal - (shoppingCartVal * discountable.getDiscount());
		return totoal;
	}
}