package laba3;

public class Laptop {
    private int ram;
    private double diagonal;
    private String company;
    private int model;
    private OperationSystem os;
    private String color;

    public Laptop(int ram, double diagonal, String company, int model, OperationSystem os, String color){
        this.ram = ram;
        this.diagonal = diagonal;
        this.company = company;
        this.model = model;
        this.os = company.equals("Apple") ? OperationSystem.MAC_OS : os;
        this.color = color;
    }

    public Laptop(){

    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public OperationSystem getOs() {
        return os;
    }

    public void setOs(OperationSystem os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.ram + " GB, " + this.diagonal +"', "+this.company+", model "+this.model+" OS - "+this.os+", color - "+this.color;
    }
}
