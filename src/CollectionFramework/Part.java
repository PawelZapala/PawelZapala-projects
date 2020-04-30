package CollectionFramework;

import java.util.Objects;

public class Part implements Comparable<Part>{
    private int partNumber;
    private String name;
    private String brand;

    public Part(int partNumber, String name, String brand) {
        this.partNumber = partNumber;
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partNumber=" + partNumber +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Part another) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Part)) return false;
        Part part = (Part) o;
        return partNumber == part.partNumber &&
                Objects.equals(name, part.name) &&
                Objects.equals(brand, part.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partNumber, name, brand);
    }
}
