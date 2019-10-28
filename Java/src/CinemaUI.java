public class CinemaUI {

    public static int[] askSeat() {
        int row = ConsoleAppUtils.askInt("Qual é a fila que quer? ");
        int seatNumber = ConsoleAppUtils.askInt("Qual lugar quer? ");

        return new int[] { row, seatNumber };

    }

    public static void showErrorMessage(String msg) {
        System.out.println(msg);
    }
}