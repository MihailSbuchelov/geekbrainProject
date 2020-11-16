package oop.advanced.animal;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void perform(int val);

    public void doActions(int val) {
        System.out.println(String.format("%s is doing excersices...", name));
        perform(val);
    }
}
