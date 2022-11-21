public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы внесли в счёт: " + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка.  Запрашиваемая сумма на снятие больше чем остаток денег на счету. " +
                    "У вас на счёте осталось: ", amount);
        } else {
            System.out.println("Доступная сумма для снятия со счёта: " + sum);
            amount -= sum;
            System.out.println("Вы сняли со счёта: " + sum);
            System.out.println(getAmount());
        }
    }
}
