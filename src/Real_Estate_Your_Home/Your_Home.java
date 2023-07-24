package Real_Estate_Your_Home;

public class Your_Home {
    public float cost_of_the_house;
    public int type_of_property;
    public float Real_Estate_Commission;
    public float Money_received_by_the_user;
    public void calculate_the_commission(){
        if (type_of_property == 1) {
            Real_Estate_Commission = cost_of_the_house * 0.10f;
        } else if (type_of_property == 2) {
            Real_Estate_Commission = cost_of_the_house * 0.12f;
        } else {
            System.out.println("Invalid option");
        }
    }
    public void Show_money_that_the_user_receives() {
        Money_received_by_the_user = cost_of_the_house - Real_Estate_Commission;
        System.out.println("The commission of the real estate is: $" + Real_Estate_Commission);
        System.out.println("Money received by the user: $" + Money_received_by_the_user);
    }
}

