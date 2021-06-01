public class Company extends EnergyСonsumer {
    @Override
    void debtCounting() {
        System.out.println("Подсчет долга с учетом налогов на пользователей-компаний");
    }

    @Override
    void paymentOfDebt() {
        System.out.println("Оплата долга через счет компании");
    }

}
