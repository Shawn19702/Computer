public class PC {
    private Case case0;
    private Motherboard motherboard;
    private Monitor monitor;

    public Case getCase0() {
        return case0;
    }

    public void setCase0(Case case0) {
        this.case0 = case0;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public PC(Case case0, Motherboard motherboard, Monitor monitor) {
        this.case0 = case0;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo() {
        monitor.drawPixel(5, 10, "red");

    }

    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today: \n" + motherboard + case0 + monitor);

    }


    public void powerUp() {
        case0.pressPowerButton();
        drawLogo();
        motherboard.loadProgram(" Windows");
    }

    @Override
    public String toString() {
        return "PC{" +
                "case1=" + case0 +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';

    }
}
