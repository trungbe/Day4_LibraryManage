package Quanlithuvien;

public class ManagerBook {
    Book[] books = new Book[20];

    public void addNewBook(int index) {
        books[index] = new Book();
        books[index].setInfor();

    }

    public void editBookByIndex(int index) {
        books[index].setInfor();

    }

    public int getMaxPrice() {
        int maxPrice = books[0].price;
        for (int i = 0; i < books.length; i++) {
            if (maxPrice < books[i].price) {
                maxPrice = books[i].price;
            }
        }
        return maxPrice;
    }

    public int getSumPrice() {
        int sumPrice = 0;
        for (int i = 0; i < books.length; i++) {
            sumPrice += books[i].getTottalPrice();
        }
        return sumPrice;
    }
//    public void printListBooks(){
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i].toString());
//        }
//    }
}
