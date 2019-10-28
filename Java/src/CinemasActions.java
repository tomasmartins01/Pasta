public class CinemasActions {
    public static void sellTicket(){

        int[] seat = CinemaUI.askSeat();
        boolean ok = CinemaData.sellTicket(seat[0], seat[1]);

        if (!ok){

            CinemaUI.showErrorMessage("Could Not sell this ticket");
        }
    }
}