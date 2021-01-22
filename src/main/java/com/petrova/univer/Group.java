package com.petrova.univer;

import java.util.List;

public class Group {
    private List<Student> students;
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Group (String groupName) {
        this.groupName = groupName;
    }
    public Group (String groupName, List<Student> students) {
        this.groupName = groupName;
        this.students = students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
