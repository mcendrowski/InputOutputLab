/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputlab;

/**
 *
 * @author MCENDROWSKI
 */
public interface MailingListStrategy {

    public abstract String getAddress();

    public abstract String getCity();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract int getMailingId();

    public abstract String getState();

    public abstract String getStreet();

    public abstract String getZipcode();

    public abstract void setAddress(String address);

    public abstract void setCity(String city);

    public abstract void setFirstName(String firstName);

    public abstract void setLastName(String lastName);

    public abstract void setMailingId(int mailingId);

    public abstract void setState(String State);

    public abstract void setStreet(String street);

    public abstract void setZipcode(String zipcode);
    
}
