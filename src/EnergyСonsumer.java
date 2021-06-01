public abstract class EnergyСonsumer {
    abstract void debtCounting();
    abstract void paymentOfDebt();

    public final void payBills(){
        debtCounting();
        paymentOfDebt();
    }

}
