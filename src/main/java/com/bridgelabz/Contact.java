package com.bridgelabz;
/**************************************************************
 * Purpose : POJO for contact
 * @author Ganesh Gavhad
 * @Version 1.0
 * @since 18-08-2021
 *
 ************************************************************/

import java.util.regex.Pattern;


public class Contact {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phone;
    public String email;

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Checks regex pattern for First name
     * If matches sets the first name.
     * @param firstName
     * @throws CustomException
     */
    public void setFirstName(String firstName) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
        if (check)
            this.firstName = firstName;
        else
            throw new CustomException(CustomException.Exception.FIRST_NAME_INCORRECT);
    }

    public String getLastName() {
        return lastName;
    }
    /**
     * Checks regex pattern for Last name
     * If matches sets the last name.
     * @param lastName
     * @throws CustomException
     */
    public void setLastName(String lastName) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
        if(check)
            this.lastName = lastName;
        else
            throw new CustomException(CustomException.Exception.LAST_NAME_INCORRECT);
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    /**
     * Checks regex pattern for city
     * If matches sets the city.
     * @param city
     * @throws CustomException
     */
    public void setCity(String city) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", city);
        if(check)
            this.city = city;
        else
            throw new CustomException(CustomException.Exception.CITY_INCORRECT);
    }
    public String getState() {
        return state;
    }


    /**
     * Checks regex pattern for state name
     * If matches sets the state.
     * @param state
     * @throws CustomException
     */
    public void setState(String state) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", state);
        if(check)
            this.state = state;
        else
            throw new CustomException(CustomException.Exception.STATE_INCORRECT);
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhone() {
        return phone;
    }
    /**
     * Checks regex pattern for phone number
     * If matches sets the phone number.
     * @param phone
     * @throws CustomException
     */
    public void setPhone(String phone) throws CustomException {
        boolean check = Pattern.matches("^[1-9][0-9][1-9]{10}$", phone);
        if(check)
            this.phone = phone;
        else
            throw new CustomException(CustomException.Exception.PHONE_INCORRECT);
    }
    public String getEmail() {
        return email;
    }

    /**
     * Checks regex pattern for email id
     * If matches sets the first email id.
     * @param email
     * @throws CustomException
     */
    public void setEmail(String email) throws CustomException {
        boolean check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", email);
        if(check)
            this.email = email;
        else
            throw new CustomException(CustomException.Exception.EMAIL_INCORRECT);
    }

}

