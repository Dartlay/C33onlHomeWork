package lesson_10_homework;

import java.util.Objects;

public class UserPc {
    private String processor;
    private String graphicsCard;
    private String motherboard;
    private String cooler;
    private String powerSupply;
    private String ram;
    private String storage;

    public UserPc(String processor,
                  String graphicsCard,
                  String motherboard,
                  String cooler,
                  String powerSupply,
                  String ram,
                  String storage) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.motherboard = motherboard;
        this.cooler = cooler;
        this.powerSupply = powerSupply;
        this.ram = ram;
        this.storage = storage;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserPc)) return false;
        UserPc user = (UserPc) o;
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