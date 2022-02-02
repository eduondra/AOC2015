import java.util.Objects;

public class Position {

    int x = 0;
    int y = 0;


    public Position(int posiofX, int posiofY) {
        this.x = posiofX;
        this.y = posiofY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }


}
