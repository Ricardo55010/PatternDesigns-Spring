package com.example.designPatterns.builder;

public class Contact {
    private final String firstName;
    private final String lastName;
    private final String emailAdress;

    public Contact(String firstName, String lastName, String emailAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAdress = emailAdress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getLastName() {
        return lastName;
    }
    public static class ContactBuilder{
        private String firstName;
        private String lastName;
        private String emailAddress;

        private ContactBuilder(){
            super();
        }

        public static ContactBuilder getInstance(){
            return new ContactBuilder();
        }

        public ContactBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Contact build(){
            return new Contact(firstName,lastName,emailAddress);
        }
    }
}
