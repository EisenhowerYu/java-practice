public class paymentCardPlus extends paymentCard 
{
    private int points;

    public paymentCardPlus(String name, double startingBalance, int points) {
        super(name, startingBalance);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
