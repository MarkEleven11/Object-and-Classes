import java.util.Objects;

public class Author {
    private String name;
    private String surname;

     Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    ///Метод toString
    public String toString() {
         return this.name + " " + this.surname + ", ";
    }

    ///Метод Equals
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a1 = (Author) other;
        return surname.equals(a1.surname) && name.equals(a1.surname);
    }

    ///Метод HashCode

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
