package Quanlithuvien;

public class Book {
    String name;
    String author;
    int price;
    int amount;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public Book() {

    }


    void setInfor() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        name = input.nextLine();
        System.out.println("Nhập tên tác giả: ");
        author = input.nextLine();
        System.out.println("Nhập giá: ");
        price = input.nextInt();
        System.out.println("Nhập số lượng: ");
        amount = input.nextInt();
        System.out.println("Nhập trọng lượng: ");
        weight = input.nextDouble();
    }

    public double getTottalPrice() {
        return price * amount;
    }

    public double getTottalWeigh() {
        return weight * weight;
    }

//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                ", amount=" + amount +
//                ", weight=" + weight +
//                '}';
//    }
}
