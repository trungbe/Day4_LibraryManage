package Quanlithuvien;

public class Main {

    public static void main(String[] args) {
        ManagerBook managerBook = new ManagerBook();
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Tạo mới 1 cuốn sách");
            System.out.println("2. Nhập và index và sửa thông tin");
            System.out.println("3. Sách có số tiền lớn nhất");
            System.out.println("4. Tổng số tiền sách của cả thư viện");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập thứ tự: ");
                    int index1 = input.nextInt();
                    managerBook.addNewBook(index1);
                    break;
                case 2:
                    System.out.println("Nhập thứ tự cần sửa: ");
                    int index2 = input.nextInt();
                    managerBook.editBookByIndex(index2);
                    break;
                case 3:
                    System.out.println("Giá sách lớn nhất: "+managerBook.getMaxPrice());
                    break;
                case 4:
                    System.out.println("Tổng số tiền sách cả thư viện: "+managerBook.getSumPrice());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
