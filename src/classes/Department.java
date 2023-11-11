package classes;

import java.util.Objects;

public class Department {
    private String name;
    private final Long id;

    public Department(Long id , String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + this.name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName() , this.getId());
    }

    // Equals method should also be overridden for consistency with hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department department = (Department) o;
        return Objects.equals(this.getName(), department.getName()) &&
                Objects.equals(this.getId(), department.getId());
    }
}
