import java.util.Scanner;

public class Add
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tổng số phần tử trong mảng :");
        int totalIndex = scanner.nextInt();
        int[] arr;
        arr = new int[totalIndex];
        int index = 0;

        //thêm phần tử
        for (int x = 0; x < arr.length; x++)
        {
            System.out.println("Nhập vào phần tử " + (x + 1) + ":");
            arr[x] = scanner.nextInt();
        }
        //print mảng
        for (int x = 0; x < arr.length; x++)
        {
            System.out.println(arr[x]);
        }
        //tìm và thay thế
        do {
            System.out.println("Nhập vị trí cần chèn :");
            index = scanner.nextInt();
            System.out.println("Nhập số cần chèn :");
            int number = scanner.nextInt();
            for (int x = 0; x < arr.length; x++)
            {
                if (arr[x] == index)
                {
                    for (int i = arr.length -1; i > x -1; i--)
                    {
                        arr[i] = arr[i-1];
                    }
                    arr[x] = number;
                    break;
                }
            }
            for ( int j =0; j < arr.length; j++)
            {
                System.out.println(arr[j]);
            }
        }while (index >= 0);
    }
}
