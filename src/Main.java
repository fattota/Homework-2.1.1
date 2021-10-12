public class Main {
    public static void main(String[] args) {
        int ticketPrice = 50000;
        int bonusPerMile = 20;
        int milesNumber = ticketPrice / bonusPerMile;

        System.out.println(milesNumber / bonusPerMile + "miles");


    }
}