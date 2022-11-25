package UserInterfaces;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dillan
 */
public class Matter {
    
    private String nameMater;
    private ArrayList <String> teachers; // El string debe ser cambiado por la clase Teacher

    public Matter(){
        this.nameMater = "";
        this.teachers = new ArrayList<>();
    }
    public Matter(String nameMater) {
        this.nameMater = nameMater;
        this.teachers = new ArrayList<>();
    }

    public String getNameMater() {
        return nameMater;
    }

    public void setNameMater(String nameMater) {
        this.nameMater = nameMater;
    }
    
}
