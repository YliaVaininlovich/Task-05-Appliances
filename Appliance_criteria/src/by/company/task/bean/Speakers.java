package by.company.task.bean;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends ComputeAppliances implements Serializable {

    private int  power_consumption;
    private int  number_of_speakers;
    private String  frequency_range;
    private int  cord_length;

    public Speakers() {
    }

    public Speakers(int power_consumption, int number_of_speakers, String frequency_range, int cord_length) {
        this.power_consumption = power_consumption;
        this.number_of_speakers = number_of_speakers;
        this.frequency_range = frequency_range;
        this.cord_length = cord_length;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getNumber_of_speakers() {
        return number_of_speakers;
    }

    public void setNumber_of_speakers(int number_of_speakers) {
        this.number_of_speakers = number_of_speakers;
    }

    public String getFrequency_range() {
        return frequency_range;
    }

    public void setFrequency_range(String frequency_range) {
        this.frequency_range = frequency_range;
    }

    public int getCord_length() {
        return cord_length;
    }

    public void setCord_length(int cord_length) {
        this.cord_length = cord_length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return power_consumption == speakers.power_consumption &&
                number_of_speakers == speakers.number_of_speakers &&
                cord_length == speakers.cord_length &&
                Objects.equals(frequency_range, speakers.frequency_range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, number_of_speakers, frequency_range, cord_length);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + power_consumption +
                ", number_of_speakers=" + number_of_speakers +
                ", frequency_range='" + frequency_range + '\'' +
                ", cord_length=" + cord_length +
                '}';
    }

}
