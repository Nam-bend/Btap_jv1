package Abstract_Polymrphism;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void capture() {
        System.out.println("credit card captured");
    }

    @Override
    public void authorize() {
        System.out.println("credit card authorri");
    }
}