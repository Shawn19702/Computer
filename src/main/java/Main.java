public class Main {
    public static void main(String[] args) {

        Resolution resolution1 = new Resolution(5, 3);
        Monitor monitor = new Monitor(resolution1, "4k", "Windows");
        Dimensions dimensions = new Dimensions(12, 8, 6);
        Case case1 = new Case("3D", "Windows", "PowerMaster", dimensions);
        Motherboard motherboard = new Motherboard("ATX", "Intel", 10, "Asus", 5);

        PC DellInspiron = new PC (case1, motherboard, monitor);


        DellInspiron.description();

        DellInspiron.powerUp();



    }
}
