package com.solvd.DAO.entities;

import java.util.Objects;

public class TeacherRef {
    private Integer teacherId;

    public TeacherRef() { }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherRef that = (TeacherRef) o;
        return Objects.equals(teacherId, that.teacherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId);
    }

    @Override
    public String toString() {
        return "TeacherRef{" +
                "teacherId=" + teacherId +
                '}';
    }
}
