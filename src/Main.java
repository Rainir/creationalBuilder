import Person.PersonBuilder;
import Person.Person;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setLastName("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        System.out.println("Есть ли у " + mom.getName() + " адрес: " + mom.hasAddress());
        System.out.println("Есть ли у " + mom.getName() + " возраст: " + mom.hasAge());
        son.happyBirthday();
        System.out.println("Есть ли у " + son.getName() + " возраст: " + son.hasAge());

        mom.setAddress("Краснодар");
        System.out.println(mom);


//            Person dada = new PersonBuilder()
//                    //.setName("Максим")
//                    .setLastName("Вольф")
//                    .setAge(21)
//                    .setAddress("Токио")
//                    .build();
//
//            Person brother = new PersonBuilder()
//                .setName("Василий")
//                .setLastName("Вольф")
//                .setAge(-3)
//                .setAddress("Токио")
//                .build();

        try {
            Person dad = new PersonBuilder()
                    //.setName("Максим")
                    .setLastName("Вольф")
                    .setAge(21)
                    .setAddress("Токио")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person brother = new PersonBuilder()
                    .setName("Василий")
                    .setLastName("Вольф")
                    .setAge(-100)
                    .setAddress("Токио")
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}