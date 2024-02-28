import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
    //object
    Scanner p = new Scanner (System.in);
        //String -> Int -> double 
        //local variable
        String nama;
        int price;
        int stock;
        int number;
        System.out.print("nama: ");
        nama = p.nextLine();
        System.out.print("price: ");
        price = p.nextInt();
        System.out.print("stock: ");
        stock = p.nextInt();
        System.out.print("number: ");
        number = p.nextInt();

        System.out.println("===hasil===");
        Product hp = new Product(nama, price, stock, number);
        System.out.println(hp.toString());

    }
    
}
