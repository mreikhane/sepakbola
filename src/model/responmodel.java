package model;

public class responmodel {
    private String Nama;
    private  String Code;

    public responmodel() {

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    private String Country;

    public responmodel(String nama, String code, String country) {
        Nama = nama;
        Code = code;
        Country = country;
    }
}


