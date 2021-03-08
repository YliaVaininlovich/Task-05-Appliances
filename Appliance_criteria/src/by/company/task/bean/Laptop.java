package by.company.task.bean;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends ComputeAppliances implements Serializable, Comparable<Laptop> {
    private double battery_capacity;
    private String os;
    private int memory_rom;
    private int system_memory;
    private double cpu;
    private int display_inchs;

    public Laptop() {
    }

    public Laptop(double battery_capacity, String os, int memory_rom, int system_memory, double cpu, int display_inchs) {

        this.battery_capacity = battery_capacity;
        this.os = os;
        this.memory_rom = memory_rom;
        this.system_memory = system_memory;
        this.cpu = cpu;
        this.display_inchs = display_inchs;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public int getSystem_memory() {
        return system_memory;
    }

    public void setSystem_memory(int system_memory) {
        this.system_memory = system_memory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplay_inchs() {
        return display_inchs;
    }

    public void setDisplay_inchs(int display_inchs) {
        this.display_inchs = display_inchs;
    }

    public double getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return battery_capacity == laptop.battery_capacity &&
                memory_rom == laptop.memory_rom &&
                system_memory == laptop.system_memory &&
                cpu == laptop.cpu &&
                display_inchs == laptop.display_inchs &&
                Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, os, memory_rom, system_memory, cpu, display_inchs);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", os='" + os + '\'' +
                ", memory_rom=" + memory_rom +
                ", system_memory=" + system_memory +
                ", cpu=" + cpu +
                ", display_inchs=" + display_inchs +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        if (battery_capacity > o.battery_capacity) {
            return 1;
        } else {
            if (battery_capacity < o.battery_capacity) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
