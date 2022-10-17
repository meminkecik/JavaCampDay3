package homework3.entities;

public class Instructor {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    private String surName;

    public Instructor(int id, String name, String surName, String nationalIdentity) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.nationalIdentity = nationalIdentity;
    }

    private String nationalIdentity;
}
