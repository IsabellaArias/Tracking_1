package Consessionary_of_cars;

public class Consessionary {
    public int brand;
    public int reference;
    public void Information_and_Features(){
        if (brand == 1){
            System.out.println("Chevrolet Captiva is a spacious and comfortable SUV.");
            System.out.println("Chevrolet Tracker is a compact and versatile SUV.");
        }else if (brand == 2){
            System.out.println("Mazda3 is a sports sedan with style and advanced technology.");
            System.out.println("Mazda CX-5 is a stylish SUV with excellent performance.");
        }else if (brand == 3){
            System.out.println("Renault Sandero is a practical and economical hatchback.");
            System.out.println("Renault Duster is a robust and adventurous SUV.");
        }
    }
}
