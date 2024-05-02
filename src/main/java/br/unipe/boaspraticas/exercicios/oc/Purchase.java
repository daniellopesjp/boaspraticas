package br.unipe.boaspraticas.exercicios.oc;

public class Purchase {
    private Customer customer;
    private SendEmail sendEmail;

    public Purchase(Customer customer, SendEmail sendEmail) {
        this.customer = customer;
        this.sendEmail = sendEmail;
    }

    public void addToTotalPurchaseAmount(double amount) {
        if (amount > 0) {
            customer.addToTotalPurchaseAmount(amount);
        } else {
            System.out.println("Valor de compra inválido!");
        }
    }

    public void makePurchase(double amount) {
        if (amount > 0) {
            addToTotalPurchaseAmount(amount);
            System.out.println("Compra realizada com sucesso!");
            ageVerification(amount);
        } else {
            System.out.println("Valor de compra inválido!");
        }
    }

    private void ageVerification(double amount) {
        if (customer.getAge() >= 18) {
            sendEmail.sendEmailReceipt(amount);
        }
    }
}
