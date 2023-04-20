package less1.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String phone;
    private int age;
    private String gender;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private Person(Builder builder){
        setFirstName(builder.firstName);
        setMiddleName(builder.lastName);
        setMiddleName(builder.middleName);
        setCountry(builder.country);
        setPhone(builder.phone);
        setAge(builder.age);
        setGender(builder.gender);

    }

    public static Builder newBuilder(){return new Builder();}


    public static final class Builder{

        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String phone;
        private int age;
        private String gender;




        private Builder(){}


        public Builder addFirstName(String val){
            firstName=val;
            return this;
        }

        public Builder addLastName(String val){
            lastName=val;
            return this;
        }

        public Builder addMiddleName(String val){
            middleName=val;
            return this;
        }

        public Builder addCountry(String val){
            country=val;
            return this;
        }

        public Builder addPhone(String val){
            phone=val;
            return this;
        }

        public Builder addAge(int val){
            age=val;
            return this;
        }

        public Builder addGender(String val){
            gender=val;
            return this;
        }

        public Person build(){
            return  new Person(this);
        }


    }

    @Override
    public String toString() {
        return "Person{\n" +
                "   firstName='" + firstName + "\'\n" +
                "   lastName='" + lastName + "\'\n" +
                "   middleName='" + middleName + "\'\n" +
                "   country='" + country + "\'\n" +
                "   phone='" + phone + "\'\n" +
                "   age=" + age + "\n"+
                "   gender='" + gender + "\'\n" +
                '}';
    }
}
