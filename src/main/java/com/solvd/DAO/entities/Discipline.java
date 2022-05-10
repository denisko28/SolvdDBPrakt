package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class Discipline {
    private Integer id;
    private String name;

    private List<Mark> marks;
    private List<TeacherRef> teachers;
    private List<SpecialtyDiscipline> specialtiesDisciplines;

    public Discipline() { }

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

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public List<TeacherRef> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherRef> teachers) {
        this.teachers = teachers;
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
        Discipline that = (Discipline) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(marks, that.marks) && Objects.equals(teachers, that.teachers) && Objects.equals(specialtiesDisciplines, that.specialtiesDisciplines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, marks, teachers, specialtiesDisciplines);
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", teachers=" + teachers +
                ", specialtiesDisciplines=" + specialtiesDisciplines +
                '}';
    }
}
