package Multiplication_tables;

public class Tables {
    public int table_number;
    public int result;
    public  void Print_Table() {
        for (int i = 1; i <= 10; i++) {
            result = table_number * i;
            System.out.println(table_number + " x " + i + " = " + result);
        }
    }
}
