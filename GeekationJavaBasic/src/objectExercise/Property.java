package objectExercise;

public class Property {
    protected String name;
    protected String user;
    protected String type;
    protected String price;

    Property(String name, String user, String type, String price) {
        this.name = name;
        this.user = user;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void showInfo(){
        System.out.println("=============================");
        System.out.println("物件名：" + this.getName());
        System.out.println("物件所有者名：" + this.getUser());
        System.out.println("物件種別：" + this.getType());
        System.out.println("物件価格：" + this.getPrice() + "円");
        displayDetails();
        System.out.println("=============================");
    }

    private void displayDetails(){
        return;
    }
}
