package JAVA;
abstract class Resource {
    protected String resourceName;
    protected int quantity;

    public Resource(String resourceName, int quantity) {
        this.resourceName = resourceName;
        this.quantity = quantity;
    }

   
    public abstract void relocate(String location);
}
