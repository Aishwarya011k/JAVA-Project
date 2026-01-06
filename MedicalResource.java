package JAVA;
public class MedicalResource extends Resource {

    public MedicalResource(int quantity) {
        super("Medical Supplies", quantity);
    }

    @Override
    public void relocate(String location) {
        System.out.println(quantity + " units of Medical Supplies relocated to " +
                location + " with emergency medical teams.");
    }
}
 
