package Italian_pizzeria;

public class Italian_pizzeria_for_sale {
    public int menu;
    public int total_payable;
    public int Amount_you_want;
    public int sauce;
    public int no_sauce;
    public void Pizza_Options_Menu() {
        if (menu == 1) {
            no_sauce = 7000 * Amount_you_want;
        } else if (menu == 2) {
            no_sauce = 5000 * Amount_you_want;
        } else if (menu == 3) {
            no_sauce = 15000 * Amount_you_want;
        }

        if (sauce == 1) {
            total_payable = no_sauce + 3000;
            System.out.println("Must pay $" + total_payable);
        } else {
            System.out.println("Must pay $" + no_sauce);
        }
    }
}
