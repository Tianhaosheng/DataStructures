package Reflection;

public class Person {
    private String name;

    public Person() {
    }

    private Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void show(){
        System.out.println("私有方法");
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }

}
