package com.example.hellorest.users;

public class Company{
    private String bs;
    private String catchPhrase;
    private String name;

    public Company(String bs, String catchPhrase, String name) {
        this.bs = bs;
        this.catchPhrase = catchPhrase;
        this.name = name;
    }

    public Company() {
    }

    public void setBs(String bs){
        this.bs = bs;
    }

    public String getBs(){
        return bs;
    }

    public void setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

