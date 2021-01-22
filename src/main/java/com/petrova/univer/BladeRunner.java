package com.petrova.univer;

import exception.IncorrectMarkException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BladeRunner {
    static Subject solfeggio = new Subject("Solfeggio");
    static Subject english = new Subject("English");
    static Subject speciality = new Subject("Speciality");
    static Subject choir = new Subject("Choir");
    static Subject musicPhilosophy = new Subject("Music Philosophy");

    static Map<Subject, Integer> alexMarks = new HashMap<>();

    static {
        alexMarks.put(solfeggio, 10);
        alexMarks.put(speciality, 8);
        alexMarks.put(english, 10);
        alexMarks.put(choir, 10);
    }

    static Map<Subject, Integer> felixMarks = new HashMap<>();

    static {
        felixMarks.put(solfeggio, 9);
        felixMarks.put(speciality, 9);
        felixMarks.put(english, 10);
        felixMarks.put(choir, 2);
    }

    static Map<Subject, Integer> loraMarks = new HashMap<>();

    static {
        loraMarks.put(solfeggio, 5);
        loraMarks.put(speciality, 6);
        loraMarks.put(english, 9);
        loraMarks.put(choir, 9);
    }


    static List<Student> students = Arrays.asList(
            new Student("Alex", alexMarks),
            new Student("Lora", loraMarks),
            new Student("Felix", felixMarks)
    );

    static Map<Subject, Integer> aleksandrMarks = new HashMap<>();

    static {
        aleksandrMarks.put(solfeggio, 5);
        aleksandrMarks.put(speciality, 6);
        aleksandrMarks.put(english, 9);
        aleksandrMarks.put(musicPhilosophy, 9);
    }

    static Map<Subject, Integer> lolaMarks = new HashMap<>();

    static {
        lolaMarks.put(solfeggio, 3);
        lolaMarks.put(speciality, 10);
        lolaMarks.put(english, 7);
        lolaMarks.put(musicPhilosophy, 9);
    }

    static Map<Subject, Integer> fexMarks = new HashMap<>();

    static {
        fexMarks.put(solfeggio, 10);
        fexMarks.put(speciality, 6);
        fexMarks.put(english, 2);
        fexMarks.put(musicPhilosophy, 9);
    }

    static Group groupA = new Group("A1", students);
    static List<Student> studentsB = Arrays.asList(
            new Student("Aleksandr", aleksandrMarks),
            new Student("Lola", loraMarks),
            new Student("Fex", fexMarks)

    );
    static Group groupB = new Group("B1", studentsB);
    static List<Group> theoreticFacultyGroups = Arrays.asList(groupA, groupB);
    static Faculty theoreticFaculty = new Faculty(theoreticFacultyGroups, " Theoretic faculty");

    static Map<Subject, Integer> juliaMarks = new HashMap<>();

    static {
        juliaMarks.put(solfeggio, 9);
        juliaMarks.put(speciality, 9);
        juliaMarks.put(english, 4);
    }

    static Map<Subject, Integer> loricMarks = new HashMap<>();

    static {
        loricMarks.put(solfeggio, 7);
        loricMarks.put(speciality, 10);
        loricMarks.put(english, 2);
    }

    static Map<Subject, Integer> fediaMarks = new HashMap<>();

    static {
        fediaMarks.put(solfeggio, 9);
        fediaMarks.put(speciality, 1);
        fediaMarks.put(english, 4);
    }

    static List<Student> studentsC = Arrays.asList(
            new Student("Julia", juliaMarks),
            new Student("Loric", loricMarks),
            new Student("Fedia", fediaMarks)
    );
    static Group groupC = new Group("C1", studentsC);
    static List<Group> orchestraFacultyGroups = Arrays.asList(groupC);
    static Faculty orchestraFaculty = new Faculty(orchestraFacultyGroups, " Orchestra  faculty");
    static List<Faculty> faculties = Arrays.asList(orchestraFaculty, theoreticFaculty);
    static Univer univer = new Univer(faculties);
    static List<Subject> subjects = Arrays.asList(
            new Subject("Speciality"),
            new Subject("Solfeggio"),
            new Subject("English")
    );

    public static void main(String[] args) {
        Univer univer = new Univer(faculties);
        try {
            System.out.println("Average mark for student Felix =  " + UniverUtil.averageMark(studentsB.get(1)));
        } catch (IncorrectMarkException e) {
            System.out.println(e.getMessage());
        }
        Group groupA1 = new Group("A1");
        groupA1.setStudents(studentsC);
        System.out.println("Generated group is " + groupA1.toString());
        System.out.println("Solfeggio average mark for group  A1 = " + UniverUtil.averageForGroup(groupA1, new Subject("Solfeggio")));
        Student studentFelix = new Student("Felix");
        Map<Subject, Integer> felixMarks = new HashMap<>();
        felixMarks.put(new Subject("Choir"), 11);
        studentFelix.setMarks(felixMarks);
        try {
            System.out.println("Average mark for student Felix =  " + UniverUtil.averageMark(studentFelix));
        } catch (IncorrectMarkException e) {
            System.out.println(e.getMessage());
        }
    }
}
