public class CinemaData {

    private static boolean[][] seats = new boolean[30][40];

    public static boolean sellTicket(int row, int SeatNumber) {
        if (row >= getNumberOfRow()) {
            return false;
        }
        if (row > getNumberOfRow()) {
            return false;
        }
        boolean isSold = seats[row][SeatNumber];

        if (isSold) {
            return false;
        }
        seats[row][SeatNumber] = true;
        return true;
    }

    public static boolean isSold(int row, int SeatNumber) {
        return seats[row][SeatNumber];
        
    }

    public static int getNumberOfRow() {
        return seats.length;

    }

    public static int getNumberOfSeatsPerRow() {
        return seats[0].length;
    }
}