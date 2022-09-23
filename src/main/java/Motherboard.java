public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;

    private String bios;

    private int cardslots;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public int getCardslots() {
        return cardslots;
    }

    public void setCardslots(int cardslots) {
        this.cardslots = cardslots;
    }

    public Motherboard(String model, String manufacturer, int ramSlots, String bios, int cardslots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
        this.cardslots = cardslots;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ramSlots=" + ramSlots +
                ", bios='" + bios + '\'' +
                ", cardslots=" + cardslots +
                '}';
    }

    public void loadProgram(String programName){
        System.out.println(programName + " " +  "programName is now running by using the programName argument passed to it");
    }


}
