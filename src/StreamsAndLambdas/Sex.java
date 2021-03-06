package StreamsAndLambdas;

public enum Sex {
    MALE("MALE"),
    FEMALE("FEMALE");

    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
