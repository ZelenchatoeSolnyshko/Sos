package Person;

public class BuilderMain {
    public static void main(String[] args) {
        Person p = Person.builder()
                .FirstName("Praskofya")
                .MiddleName("Durakova")
                .LastName("Akakievna")
                .Male(false)
                .Age(27)
                .Height(150.0)
                .Weight(100.0)
                .build();
        System.out.println(p);

    }
}
