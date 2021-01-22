package com.petrova.univer;

import java.util.List;

public class Univer {

    private List<Faculty> faculties;

    public Univer(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}
