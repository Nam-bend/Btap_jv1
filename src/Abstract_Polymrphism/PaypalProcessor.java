package Abstract_Polymrphism;

public class PaypalProcessor implements PaymentProcessor{
    @Override
    public void capture() {
        System.out.println("paypal capture");
    }

    @Override
    public void authorize() {
        System.out.println("paypal authorize");
    }
}
