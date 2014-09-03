package com.salesforce.glassdemo.models;

import java.util.ArrayList;

public class Inspection {
    public String id;

    /** Name of the inspection */
    public String title;

    /** List of steps in this inspection */
    public ArrayList<InspectionStep> steps;

    public Inspection() {
        steps = new ArrayList<InspectionStep>();
    }

    @Override
    public String toString() {
        return "Inspection{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", steps=" + steps +
                '}';
    }
}
