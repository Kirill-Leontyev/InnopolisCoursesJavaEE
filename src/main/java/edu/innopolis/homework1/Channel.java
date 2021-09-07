package edu.innopolis.homework1;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Program> programs;
    String name;

    Channel(String name) {
        this.name = name;
        programs = new ArrayList<>();
    }

    Channel(String name, List<Program> programs) {
        this.name = name;
        this.programs = programs;
    }

    public String getName() {
        return name;
    }

    public void addProgram(Program program) {
        programs.add(program);
    }

    public Program getProgram(int programNum) {
        return programs.get(programNum);
    }

    public int programCount() {
        return programs.size();
    }
}

