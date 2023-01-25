package Person;

public class PersonBuilder {
    protected String name;
    protected String lastName;
    protected Integer age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Select name");
        }
        if (lastName == null) {
            throw new IllegalStateException("Select lastName");
        }
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Enter a valid age(0=<age<150)");
        }
        return new Person(this);
    }
}
