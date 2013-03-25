
package entity;


public class Guest {
    private String name; 
    private String address; 
    private String gender; 
    private String contactNum; 
 

public Guest(String name, String address, String gender,  String contactNum){ 
    this.name = name;  
    this.address = address; 
    this.gender = gender; 
    this.contactNum = contactNum; 

    }

    public Guest(){
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getGender(){
        return gender;
    }   
    public void setGender(String gender){
        this.gender = gender;

    }
    public String getcontactNum(){
        return contactNum;
    }
    public void setcontactNum(String contactNum){
        this.contactNum = contactNum;

    }

}
