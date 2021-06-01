public class Individual extends EnergyСonsumer {
    @Override
    void debtCounting() {
        System.out.println("Подсчет долга без учета доп налогов");

    }

    @Override
    void paymentOfDebt() {
        System.out.println("Оплата долга через любой доступный банк");
    }
}
