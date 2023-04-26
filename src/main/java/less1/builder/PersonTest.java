package less1.builder;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = Person.newBuilder()
                .addFirstName("Nikolai")
                .addLastName("Vashev")
                .addMiddleName("Olegovitch")
                .addCountry("Russia")
                .addPhone("8 999 999 99 99")
                .addAge(23)
                .addGender("male")
                .build();

        System.out.println(p1);
    }
}
