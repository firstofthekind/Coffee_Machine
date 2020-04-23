import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String string = String.valueOf(a);
        int[] array = new int[string.length()];
        int[] array1 = new int[3];
        int b = 0;
        for (int i = 0; i < string.length(); i++) {
            array1[i] = Integer.parseInt(Character.toString(string.charAt(2 - i)));
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
    }
}
