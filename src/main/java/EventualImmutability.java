public class EventualImmutability {
    public static void main(String[] args) {
        ImmutablePerson.Builder obj= new ImmutablePerson.Builder("vishad");
        ImmutablePerson person=obj.build();
        System.out.println(person);
        person=obj.setLastName("saxena").build();
        System.out.println(person);


        person=obj.setLastName("johari").build();
        System.out.println(person);
    }
}
final class ImmutablePerson{
    private final String firstName;
    private final String lastName;

//    @Override
//    public String toString() {
//        return "ImmutablePerson{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }

    public ImmutablePerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    static class Builder{
        private final String firstName;
        private String lastName;

        public Builder(String firstName){
            this.firstName=firstName;
        }
        public Builder setLastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        public ImmutablePerson build(){
            return new ImmutablePerson(firstName,lastName);
        }
    }
}
