package com.Sainz;

public class Experience {
    private String title;
    private String employer;
    private String datesEmployed;
    private String duties;

    @Override
    public String toString() {
        return "Employer: " + employer + '\n' + "Title: " + title + '\n' + "Dates employed: " + datesEmployed +
                '\n' + "Responsibilities: " + duties;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getDatesEmployed() {
        return datesEmployed;
    }

    public void setDatesEmployed(String datesEmployed) {
        this.datesEmployed = datesEmployed;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }
}
