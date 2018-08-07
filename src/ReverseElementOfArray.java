import java.util.Scanner;

public class ReverseElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kiểm tra kích thước tối đa của mảng
        int sizeOfArray;
        do {
            System.out.println("Nhập vào kích thước của mảng:");
            sizeOfArray = scanner.nextInt();
            if (sizeOfArray > 20) {
                System.out.println("Kích thước tối đa của mảng là 20");
            }
        } while (sizeOfArray > 20);


    }
}
