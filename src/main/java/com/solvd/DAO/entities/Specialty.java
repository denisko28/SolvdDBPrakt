package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class Specialty {
    private Integer id;
    private String name;
    private Integer eduFormCode;

    private List<Group> groups;
    private List<SpecialtyDiscipline> specialtiesDisciplines;

    public Specialty() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEduFormCode() {
        return eduFormCode;
    }

    public void setEduFormCode(Integer eduFormCode) {
        this.eduFormCode = eduFormCode;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<SpecialtyDiscipline> getSpecialtiesDisciplines() {
        return specialtiesDisciplines;
    }

    public void setSpecialtiesDisciplines(List<SpecialtyDiscipline> specialtiesDisciplines) {
        this.specialtiesDisciplines = specialtiesDisciplines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialty specialty = (Specialty) o;
        return Objects.equals(id, specialty.id) && Objects.equals(name, specialty.name) && Objects.equals(eduFormCode, specialty.eduFormCode) && Objects.equals(groups, specialty.groups) && Objects.equals(specialtiesDisciplines, specialty.specialtiesDisciplines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, eduFormCode, groups, specialtiesDisciplines);
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eduFormCode=" + eduFormCode +
                ", groups=" + groups +
                ", specialtiesDisciplines=" + specialtiesDisciplines +
                '}';
    }
}
