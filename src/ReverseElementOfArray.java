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

        //Nhập giá trị của các phần tử
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào giá trị của phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }

        //Hiển thị mảng
        System.out.println("Mảng đã nhập: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }

        //Đảo các phần tử của mảng
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[(array.length - 1 - i)] = temp;
        }

        //Hiển thị mảng sau khi đảo
        System.out.println("\nMảng sau khi đảo: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
    }
}
