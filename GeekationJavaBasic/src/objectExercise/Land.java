package objectExercise;

public class Land extends Property {
    private String breadth;

    Land(String name, String user, String type, String price, String breadth) {
        super(name, user, type, price);
        this.breadth = breadth;
    }

    public String getBreadth() {
        return breadth;
    }

    public void setBreadth(String breadth) {
        this.breadth = breadth;
    }

    private void displayDetails(){
        System.out.println("広さ：" + this.getBreadth());
    }
}

