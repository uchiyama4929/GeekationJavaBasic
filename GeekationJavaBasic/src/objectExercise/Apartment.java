package objectExercise;

public class Apartment extends Property{
    private String layout;

    Apartment(String name, String user, String type, String price, String layout) {
        super(name, user, type, price);
        this.layout = layout;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    private void displayDetails(){
        System.out.println("間取り：" + this.getLayout());
    }
}
