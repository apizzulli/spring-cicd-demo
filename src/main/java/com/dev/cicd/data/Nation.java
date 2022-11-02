package com.dev.cicd.data;

public class Nation {
    private String nationality;
    private String capitalCity;
    private String language;
    private String currency;

    public Nation(String nationality, String capitalCity, String language, String currency) {
        this.nationality = nationality;
        this.capitalCity = capitalCity;
        this.language = language;
        this.currency = currency;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
