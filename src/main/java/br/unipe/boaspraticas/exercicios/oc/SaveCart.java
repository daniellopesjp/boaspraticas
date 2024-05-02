package br.unipe.boaspraticas.exercicios.oc;

public class Purchase {
    private Customer customer;
    private SendEmail sendEmail;

    public Purchase(Customer customer, SendEmail sendEmail) {
        this.customer = customer;
        this.sendEmail = sendEmail;
    }

    public void makePurchase(double amount) {
        if (amount <= 0) {
            System.out.println("Valor de compra inválido!");
            return;
        }

        customer.addToTotalPurchaseAmount(amount);
        System.out.println("Compra realizada com sucesso!");

        if (customer.isAdult()) {
            sendEmail.sendEmailReceipt(amount);
        }
    }
}
