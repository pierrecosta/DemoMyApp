package myapp.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "CONTACT")
public class Contact {
	@Id

	@Column(name = "PUBLICID")
    private String publicId;
 
    @Column(name = "FIRSTNAME")
    private String firstName;
 
    @Column(name = "LASTNAME")
    private String lastName;
 
    @Column(name = "PHONEIND")
    private String phoneInd;

    @Column(name = "PHONENUM")
    private double phoneNum;

    public String getPublicId() {
        return publicId;
    }
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

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
	 
   public String getPhoneInd() {
       return phoneInd;
   }
   public void setPhoneInd(String phoneInd) {
       this.phoneInd = phoneInd;
   }
   
   public double getPhoneNum() {
       return phoneNum;
   }
   public void setPhoneNum(double phoneNum) {
       this.phoneNum = phoneNum;
   }
 
}