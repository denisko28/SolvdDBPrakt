package com.solvd.DAO.entities;

public class Student {
    private Integer id;
    private PersonalDatum personalDatum;

    public Student() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonalDatum getPersonalDatum() {
        return personalDatum;
    }

    public void setPersonalDatum(PersonalDatum personalDatum) {
        this.personalDatum = personalDatum;
    }
}
