package com.petrova.univer;

import exception.IncorrectMarkException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class UniverUtil {
    public static double averageMark(Student student) throws IncorrectMarkException {

        Collection<Integer> marks = student.getMarks().values();
        double average = 0;
        for (Integer mark : marks) {
            if (mark < 0 || mark > 10) {
                throw new IncorrectMarkException("Mark cant be less than 0 and more than 10. Current mark is  " + mark);
            }
            average += mark; // average = average + mark;
        }
        return  average / marks.size();
    }

    public static double averageForGroup(Group group, Subject subject) {
        Integer groupAverage = 0;
        for (Student student : group.getStudents()) {
            Map<Subject, Integer> marks = student.getMarks();
            Integer integer = marks.get(subject);
            if (integer != null) {
                groupAverage += integer;
            }
        }
        return (double) groupAverage / group.getStudents().size();
    }

    public static double averageForUniver(Univer univer, Subject subject) {
        List<Faculty> faculties = univer.getFaculties();
        double facultyAverage = 0;
        for (Faculty faculty : faculties) {
            List<Group> groups = faculty.getGroups();
            double groupsAverage = 0;
            for (Group group : groups) {
                double average = averageForGroup(group, subject);
                groupsAverage += average;
            }
            groupsAverage /= groups.size();
            facultyAverage += groupsAverage;
        }
        return facultyAverage / faculties.size();
    }
}
