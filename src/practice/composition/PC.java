package practice.composition;

public class PC {

    /**
     * As a rule first need to look at the composition when deciding which to use(Composition or Inheritance)
     */

    private Case theCase ;    //Composition example here
    private Monitor monitor ;  //Composition example here
    private Motherboard motherboard ;  //Composition example here

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,500,"red");
    }







    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
