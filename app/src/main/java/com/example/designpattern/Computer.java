package com.example.designpattern;

public class Computer {
    private String name;
    private String os;
    private float prince;
    private int color;

    public static class Bulider{
        Computer computer;
        public Bulider() {
             computer = new Computer();
        }
        public Bulider setName(String name){
            computer.setName(name);
            return this;
        }
        public Bulider setOs(String os){
            computer.setOs(os);
            return this;
        }
        public Bulider setPrince(float prince){
            computer.setPrince(prince);
            return this;
        }
        public Bulider setColor(int color){
            computer.setColor(color);
            return this;
        }
        public Computer build(){
            return computer;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getPrince() {
        return prince;
    }

    public void setPrince(float prince) {
        this.prince = prince;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", os='" + os + '\'' +
                ", prince=" + prince +
                ", color=" + color +
                '}';
    }
}
