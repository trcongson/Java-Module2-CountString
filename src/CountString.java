import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi bất kỳ: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Số ký tự trong chuỗi là: " + count(str));
    }

    private static int count(String s){
        return s.length();
    }
}
