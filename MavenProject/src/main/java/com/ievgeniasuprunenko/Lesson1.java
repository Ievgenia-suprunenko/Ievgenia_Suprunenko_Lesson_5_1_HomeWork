package com.ievgeniasuprunenko;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Lesson1 {
    public static void main(String[] args) {
        double [] values = new double[] {23, 34, 34};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double value : values){
            descriptiveStatistics.addValue(value);
        }
        double newMean = descriptiveStatistics.getMean();
        System.out.println(newMean);
    }
}
