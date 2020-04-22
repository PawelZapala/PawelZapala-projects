package ObjectMethods;

import java.util.Objects;

public class Beer {
    public String name;
    public String type;
    public double alcoholAmount;
    public double volume;

    public Beer(String name, String type, double alcoholAmount, double volume) {
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Beer)) {
            return false;
        }
        Beer beer = (Beer) obj;
        if (this.alcoholAmount != ((Beer) obj).alcoholAmount) {
            return false;
        }
        if (this.name != ((Beer) obj).name) {
            return false;
        }
        if (this.type != ((Beer) obj).type) {
            return false;
        }
        if (this.volume != ((Beer) obj).volume) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, alcoholAmount, volume);
    }
}
