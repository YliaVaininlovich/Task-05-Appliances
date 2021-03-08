package by.company.task.dao.impl;

import by.company.task.bean.Laptop;

import java.util.Comparator;

public class LaptopComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getMemory_rom()-o2.getMemory_rom() ;
    }
}
