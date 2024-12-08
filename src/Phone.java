public class Phone extends Device{
    public void makeCall() {
        this.battery -= 5;
        System.out.println("You make a call.");
        System.out.println("Battery remaining: " + this.battery);
    }
    public void playGame() {
        this.battery -= 20;
        System.out.println("You play a game.");
        System.out.println("Battery remaining: " + this.battery);
    }
    public void charge() {
        this.battery += 50;
        System.out.println("You charge.");
        System.out.println("Battery remaining: " + this.battery);

    }
}
