package Numbers_from_one_to_six_without_the_five;

public class Numbers2 {
    public int start;
    public int finish;

    public void ShowCycle2() {
        for (int x = start; x <= finish; x++) {
            if(x != 5){
                System.out.println(x);
            }
        }
    }
}
