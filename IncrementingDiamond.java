public class IncrementingDiamond {
    public static void main(String[] args) {
        for (int i = 3; i <= 7; i++) {
            int count = i - 2;
            for (int j = 0; j < count; j++) System.out.print(i);
            System.out.println();
        }
        for (int i = 6; i >= 3; i--) {
            int count = i - 2;
            for (int j = 0; j < count; j++) System.out.print(i);
            System.out.println();
        }
    }
}