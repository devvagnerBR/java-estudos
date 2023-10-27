package memoria_arrays_listas.aula93.entities;

public class Rent {

    private String name;
    private String email;

    public Rent() {
    }

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + ", " + email;
    }

}
