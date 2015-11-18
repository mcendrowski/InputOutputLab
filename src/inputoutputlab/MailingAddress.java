package inputoutputlab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public class MailingAddress implements MailingListStrategy {
    private int mailingId;
    private String firstName;
    private String lastName;
    private String street;
    private String address;
    private String city;
    private String State;
    private String zipcode;

    public MailingAddress() {
    }
    

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getState() {
        return State;
    }

    @Override
    public void setState(String State) {
        this.State = State;
    }

    @Override
    public String getZipcode() {
        return zipcode;
    }

    @Override
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public int getMailingId() {
        return mailingId;
    }

    @Override
    public void setMailingId(int mailingId) {
        this.mailingId = mailingId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.mailingId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MailingAddress other = (MailingAddress) obj;
        if (this.mailingId != other.mailingId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MailingAddress{" + "mailingId=" + mailingId + ", firstName=" + firstName + ", lastName=" + lastName + ", street=" + street + ", address=" + address + ", city=" + city + ", State=" + State + ", zipcode=" + zipcode + '}';
    }
    
    
}
