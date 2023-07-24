package Equilateral_triangle;

public class Triangle {
    public float side_A;
    public float side_B;
    public float side_c;

    public void triangle_check(){
        if (side_A == side_B && side_B == side_c){
            System.out.println("The triangle is equilateral");
        }else{
            System.out.println("The triangle is not equilateral");
        }
    }
}
