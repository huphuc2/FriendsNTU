package vn.edu.ntu.huuph.model;

public class Friends {
    String Name;
    String Sdt;
    String Date;

    public Friends(){

    }

    public Friends(String name, String date, String sdt) {
        this.Name = name;
        this.Sdt = sdt;
        this.Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
