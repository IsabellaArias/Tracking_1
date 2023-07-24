package Sale_of_Stikers;

public class Stikers {
    public int Size_of_the_Stikers;
    public int Number_of_Stikers;
    public int total_at_pay;
    public void Calculate_the_cost_of_stikers(){
        if (Size_of_the_Stikers==1 & Number_of_Stikers >=10){
            total_at_pay=Number_of_Stikers * 4000;
            System.out.println("must pay $"+ total_at_pay);
        }else if (Size_of_the_Stikers==2 & Number_of_Stikers >=10){
            total_at_pay=Number_of_Stikers * 6000;
            System.out.println("must pay $"+ total_at_pay);
        }else{
            System.out.println("Invalid option or incorrect quantity");
        }
    }
}
