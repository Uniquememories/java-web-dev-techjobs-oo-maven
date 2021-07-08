package com.company;

import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

//    public String toString() {
//        return "\n" + "ID: " + id + "\n" +
//                "Name: " + name + "\n" +
//                "Employer: " + employer + "\n" +
//                "Location: " + location + "\n" +
//                "PositionType: " + positionType + "\n" +
//                "CoreCompetency: " + coreCompetency + "\n";
//    }

    public String toString() {
        String jobInfo = "\n";
        String emptyField = "Data not available\n";

        jobInfo += "ID: " + this.getId() + "\n";

        if(this.name.isEmpty()) {
            jobInfo += "Name: " + emptyField;
        } else {
            jobInfo += "Name: " + this.name + "\n";
        }

        if(this.employer.getValue().isEmpty()) {
            jobInfo += "Employer: " + emptyField;
        } else {
            jobInfo += "Employer: " + this.employer + "\n";
        }

        if(this.location.getValue().isEmpty()) {
            jobInfo += "Location: " + emptyField;
        } else {
            jobInfo += "Location: " + this.location + "\n";
        }

        if(this.positionType.getValue().isEmpty()) {
            jobInfo += "PositionType: " + emptyField;
        } else {
            jobInfo += "PositionType: " + this.positionType + "\n";
        }

        if(this.coreCompetency.getValue().isEmpty()) {
            jobInfo += "CoreCompetency: " + emptyField;
        } else {
            jobInfo += "CoreCompetency: " + this.coreCompetency + "\n";
        }

        return jobInfo;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
