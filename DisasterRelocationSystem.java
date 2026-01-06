package JAVA;
public class DisasterRelocationSystem {

    public static void main(String[] args) {

        // Polymorphic references
        Resource food = new FoodResource(500);
        Resource medical = new MedicalResource(200);
        Resource rescue = new RescueResource(50);

        // Same method, different behavior
        food.relocate("Flood Relief Camp");
        medical.relocate("Emergency Hospital");
        rescue.relocate("Earthquake Zone");
    }
}

