package Agregacion;

import java.util.ArrayList;

public class Company {
    private ArrayList<Department> departments = new ArrayList<Department>();

    public Company(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
}
