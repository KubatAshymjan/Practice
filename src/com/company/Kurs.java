package com.company;
// аты, номери, мугалимдин аты жону, курс башталган кун

public class Kurs {
    private String name;
    private int nomer;
    private String name_teacher;
    private int start_kurs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getName_teacher() {
        return name_teacher;
    }

    public void setName_teacher(String name_teacher) {
        this.name_teacher = name_teacher;
    }

    public int getStart_kurs() {
        return start_kurs;
    }

    public void setStart_kurs(int start_kurs) {
        this.start_kurs = start_kurs;
    }
}
