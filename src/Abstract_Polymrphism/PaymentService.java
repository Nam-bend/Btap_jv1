package Abstract_Polymrphism;

public class PaymentService {
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor=paymentProcessor;

    }
    public void process(){
        paymentProcessor.authorize();
        paymentProcessor.capture();
    }
}
