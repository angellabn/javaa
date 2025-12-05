public class twod {

    public static void main(String[] args) {
        int[][] numbers;
        numbers = new int[3][3];

        numbers[0][0] = 100;
        numbers[0][1] = 200;
        numbers[0][2] = 300;
        numbers[1][0] = 400;
        numbers[1][1] = 500;
        numbers[1][2] = 600;
        numbers[2][0] = 700;
        numbers[2][1] = 800;
        numbers[2][2] = 900;

        for (int i[] : numbers) {
            for (int j : i) {
                System.out.println(j + " ");

            }
            System.out.println();
        }
    }

}
