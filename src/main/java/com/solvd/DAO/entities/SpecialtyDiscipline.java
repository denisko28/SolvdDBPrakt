package com.solvd.DAO.entities;

import java.util.Objects;

public class SpecialtyDiscipline {
    private Integer id;
    private Integer specialtyId;
    private Integer disciplineId;

    public SpecialtyDiscipline() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialtyDiscipline that = (SpecialtyDiscipline) o;
        return Objects.equals(id, that.id) && Objects.equals(disciplineId, that.disciplineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, disciplineId);
    }

    @Override
    public String toString() {
        return "SpecialtyDiscipline{" +
                "id=" + id +
                ", disciplineId=" + disciplineId +
                '}';
    }
}
