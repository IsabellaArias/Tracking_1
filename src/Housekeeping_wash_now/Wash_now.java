package Housekeeping_wash_now;
import java.util.Scanner;
public class Wash_now {
    public int type_of_service;
    public int Quantity_of_Garments;
    public int Types_of_washing;
    public int home=3000;
    public int total_payable;
    public void Services(){
        if (type_of_service==1){
            Show_Types_of_washing();
        }else if (type_of_service==2){
            total_payable=Quantity_of_Garments*1800+home;
            System.out.println("must pay $"+ total_payable);
        }
    }
    public void Show_Types_of_washing(){
        System.out.println("Type of washing: 1) Dry 2) Normal");
        Types_of_washing = new Scanner(System.in).nextInt();
        if(Types_of_washing==1){
            total_payable=Quantity_of_Garments * 2000;
            System.out.println("must pay $"+ total_payable);
        }else if(Types_of_washing==2){
            total_payable=Quantity_of_Garments * 1500;
            System.out.println("must pay $"+ total_payable);
        }else{
            System.out.println("invalid option");
        }
    }
}
