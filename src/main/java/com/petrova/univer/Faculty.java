package com.petrova.univer;

import java.util.List;

public class Faculty {

    private List<Group> groups;
    public String facultyName;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
    public String getFacultyName(){
        return facultyName;
    }
    public void setFacultyName(String facultyName){
        this.facultyName = facultyName;
    }
    public Faculty(List<Group> groups, String facultyName){
        this.facultyName = facultyName;
        this.groups = groups;
    }
    @Override
    public String toString() {
        return "Faculty{" +
                "groups=" + groups +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }
}
