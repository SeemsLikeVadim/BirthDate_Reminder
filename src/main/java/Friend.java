import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Friend {
    private String name;

    public LocalDate getDateOfBirh() {
        return dateOfBirh;
    }

    private LocalDate dateOfBirh;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Objects.equals(name, friend.name) && Objects.equals(dateOfBirh, friend.dateOfBirh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirh);
    }

    public Friend(String name, LocalDate dateOfBirh) {
        this.name = name;
        this.dateOfBirh = dateOfBirh;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
