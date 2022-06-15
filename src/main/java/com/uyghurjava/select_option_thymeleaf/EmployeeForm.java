package com.uyghurjava.select_option_thymeleaf;

public class EmployeeForm {

    private String id;
    private String name;
    private String designation;

    public EmployeeForm() {
    }

    @Override
    public String toString() {
        return "EmployeeForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
