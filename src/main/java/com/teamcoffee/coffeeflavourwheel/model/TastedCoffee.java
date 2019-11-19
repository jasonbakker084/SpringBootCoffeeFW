//package com.teamcoffee.coffeeflavourwheel.model;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "tastedcoffee")
//public class TastedCoffee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String userType;
//
//    public TastedCoffee() {}
//
//    public TastedCoffee(String firstName, String lastName, String email, String userType) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.userType = userType;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//
//        return email;
//    }
//
//    public void setEmail(String email) {
//
//        this.email = email;
//    }
//
//    public String getUserType() {
//        return userType;
//    }
//
//    public void setUserType(String userType) {
//        this.userType = userType;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(id, user.id) &&
//                Objects.equals(firstName, user.firstName) &&
//                Objects.equals(lastName, user.lastName) &&
//                Objects.equals(email, user.email) &&
//                Objects.equals(userType, user.userType);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, lastName, email, userType);
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("User{");
//        sb.append("id=").append(id);
//        sb.append(", firstName='").append(firstName).append('\'');
//        sb.append(", lastName='").append(lastName).append('\'');
//        sb.append(", email='").append(email).append('\'');
//        sb.append(", userType='").append(userType).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
//}