package Person;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private boolean isMale;
    private double height;
    private double weight;

    public Person(String firstName, String lastName, String middleName, int age, boolean isMale, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.isMale = isMale;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public static PersonBuilder builder()
    {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static class PersonBuilder
    {
        private String firstName;
        private String lastName;
        private String middleName;
        private int age;
        private boolean isMale;
        private double height;
        private double weight;

        public Person build() {
            return new Person(firstName, lastName, middleName, age, isMale, height, weight);
        }

        public PersonBuilder FirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder LastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder MiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder Age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder Male(boolean male) {
            isMale = male;
            return this;
        }

        public PersonBuilder Height(double height) {
            this.height = height;
            return this;
        }

        public PersonBuilder Weight(double weight) {
            this.weight = weight;
            return this;
        }
    }



}
