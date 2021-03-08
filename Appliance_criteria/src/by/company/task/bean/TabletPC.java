package by.company.task.bean;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends ComputeAppliances implements Serializable {
    private int battery_capacity;
    private int  display_inches;
    private int  memory_rom;
    private int  flash_memory_capacity;
    private String   color;

    public TabletPC() {
    }

    public TabletPC(int battery_capacity, int display_inches, int memory_rom, int flash_memory_capacity, String color) {
        this.battery_capacity = battery_capacity;
        this.display_inches = display_inches;
        this.memory_rom = memory_rom;
        this.flash_memory_capacity = flash_memory_capacity;
        this.color = color;
    }

    public int getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public int getDisplay_inches() {
        return display_inches;
    }

    public void setDisplay_inches(int display_inches) {
        this.display_inches = display_inches;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public int getFlash_memory_capacity() {
        return flash_memory_capacity;
    }

    public void setFlash_memory_capacity(int flash_memory_capacity) {
        this.flash_memory_capacity = flash_memory_capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletpc = (TabletPC) o;
        return battery_capacity == tabletpc.battery_capacity &&
                display_inches == tabletpc.display_inches &&
                memory_rom == tabletpc.memory_rom &&
                flash_memory_capacity == tabletpc.flash_memory_capacity &&
                Objects.equals(color, tabletpc.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, display_inches, memory_rom, flash_memory_capacity, color);
    }

    @Override
    public String toString() {
        return "Tabletpc{" +
                "battery_capacity=" + battery_capacity +
                ", display_inches=" + display_inches +
                ", memory_rom=" + memory_rom +
                ", flash_memory_capacity=" + flash_memory_capacity +
                ", color='" + color + '\'' +
                '}';
    }
}
