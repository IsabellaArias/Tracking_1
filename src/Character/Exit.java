package Character;

public class Exit {
    public int rows;

    public void generatePattern() {
        for (int i = 0; i < rows ; i++) {
            printAsterisks();
            System.out.println("==================================");
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("==================================");
        }
    }
    public void printAsterisks() {
        for (int j = 0; j < 5; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
