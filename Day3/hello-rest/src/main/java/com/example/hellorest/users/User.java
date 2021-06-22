package com.example.hellorest.users;

public class User{
    private String website;
    private Address address;
    private String phone;
    private String name;
    private Company company;
    private int id;
    private String email;
    private String username;

    public User() {
    }

    public User(int id, String name, String username, String email, Address address, String phone, String website, Company company) {
        this.website = website;
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.company = company;
        this.id = id;
        this.email = email;
        this.username = username;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public String getWebsite(){
        return website;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public Company getCompany(){
        return company;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }


}
