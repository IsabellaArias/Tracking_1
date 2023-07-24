package Library_of_Armenia;

public class Library {
    public int action;
    public int days_of_delay;
    public int Return_of_books_or_magazines;
    public int amount;
    public int Late_payment;
    public int Payment_for_loss;
    public int Payment_at_the_bookstore() {
        if (action == 1) {
            if (Return_of_books_or_magazines == 1) {
                Late_payment = amount * days_of_delay * 600;
                return Late_payment;
            } else if (Return_of_books_or_magazines == 2) {
                Late_payment = amount * days_of_delay * 500;
                return Late_payment;
            }
        } else if (action == 2) {
            Payment_for_loss = amount * 10000;
            return Payment_for_loss;
        }
        return 0;
    }
}

