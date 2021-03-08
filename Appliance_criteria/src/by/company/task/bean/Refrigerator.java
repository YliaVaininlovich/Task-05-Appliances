package by.company.task.bean;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends KitchenAppliances implements Serializable {
    private int power_consumption;
    private int weight;
    private int freezer_capacity;
    private double overall_capacity;
    private int height;
    private int width;

    public Refrigerator() {
    }

    public Refrigerator(int power_consumption, int weight, int freezer_capacity, double overall_capacity, int height, int width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.freezer_capacity = freezer_capacity;
        this.overall_capacity = overall_capacity;
        this.height = height;
        this.width = width;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezer_capacity() {
        return freezer_capacity;
    }

    public void setFreezer_capacity(int freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    public double getOverall_capacity() {
        return overall_capacity;
    }

    public void setOverall_capacity(double overall_capacity) {
        this.overall_capacity = overall_capacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return power_consumption == that.power_consumption &&
                weight == that.weight &&
                freezer_capacity == that.freezer_capacity &&
                overall_capacity == that.overall_capacity &&
                height == that.height &&
                width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, weight, freezer_capacity, overall_capacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", freezer_capacity=" + freezer_capacity +
                ", overall_capacity=" + overall_capacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
