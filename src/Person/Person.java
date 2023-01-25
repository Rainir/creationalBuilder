package Person;

import java.util.OptionalInt;

public class Person {
    protected String name;
    protected String lastName;
    protected Integer age;
    protected String address;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public boolean hasAge() {
        return getAge().isPresent();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public OptionalInt getAge() {
        if (age == null) {
            return OptionalInt.empty();
        } else {
            return OptionalInt.of(age);
        }
    }
    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        ++age;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setLastName(lastName).setAge(0).setAddress(address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(lastName)
                .append("(возраст: ").append(age).append("), ")
                .append("город ").append(address);
        return sb.toString();
    }
}