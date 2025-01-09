package lesson_10_homework.Clone;


import java.util.Objects;

public class CloneUser implements Cloneable{
    private String processor;
    private String graphicsCard;
    private String motherboard;
    private String cooler;
    private String powerSupply;
    private String ram;
    private String storage;

    public CloneUser(String processor, String graphicsCard, String motherboard,
                     String cooler, String powerSupply, String ram, String storage) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.motherboard = motherboard;
        this.cooler = cooler;
        this.powerSupply = powerSupply;
        this.ram = ram;
        this.storage = storage;
    }

    // Геттеры
    public String getProcessor() {
        return processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getCooler() {
        return cooler;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "User Pc " +
                "\n\tProcessor : " + processor + '\'' +
                ", \n\tGraphics Card : " + graphicsCard + '\'' +
                ", \n\tMotherboard : " + motherboard + '\'' +
                ", \n\tCooler = " + cooler + '\'' +
                ", \n\tPower Supply : " + powerSupply + '\'' +
                ", \n\tRam : " + ram + '\'' +
                ", \n\tStorage : " + storage + '\'' +
                "\n}";

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public CloneUser deepClone() {
        return new CloneUser(processor, graphicsCard, motherboard,
                cooler, powerSupply, ram, storage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CloneUser)) return false;
        CloneUser user = (CloneUser) o;
        return Objects.equals(processor, user.processor) &&
                Objects.equals(graphicsCard, user.graphicsCard) &&
                Objects.equals(motherboard, user.motherboard) &&
                Objects.equals(cooler, user.cooler) &&
                Objects.equals(powerSupply, user.powerSupply) &&
                Objects.equals(ram, user.ram) &&
                Objects.equals(storage, user.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, graphicsCard, motherboard, cooler, powerSupply, ram, storage);
    }
}

