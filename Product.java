public class Product {
    //Attribute
    private String name;
    private int price;
    private int stock;
    private int number;
    private boolean status;

    //Constractor (menentukan nilai awal)
    public Product(){
        name = "asus vivobook";
        price = 2000;
        stock = 23;
        number = 2;
    }
    //Constactor parameter
    public Product (String name, int price, int stock, int number) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.number = number;
        this.status = true;
    }
    //Getter
    public String getname() {
        return name;
    }
    public int getprice() {
        return price;
    }
    public int getstock() {
        return stock;
    }
    public int getnumber() {
        return number;
    }
    public boolean getstatus() {
        return status;
    }

    //Setter
    public void setname(String name) {
        this.name = name;
    }
    public void setprice(int price) {
        this.price = price;
    }
    public void setstock(int status) {
        this.stock = stock;
    }
    public void setnumber(int number) {
        this.number = number;
    }
    public void setstatus(boolean status) {
        this.status = status;
    }

    public int getInventoryValue() {
        return this.price*this.stock;
    }
    public String toString() {
        String p;
        if (status) {
            p = "Active";
        }else{
            p = "Discontinued";
        }
    return "item Number : " +number+
        "\nName : " +name+
        "\nQuantity : " +stock+
        "\nPrice : " +price+
        "\nProduct Status: " + p+
        "\nStockValue: " + getInventoryValue();
    }
}
