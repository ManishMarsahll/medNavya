package com.sandbox.search;

public class Deal {
    private String Diseases;
    private String Tabname;
    private String desc;
    private String medshop;
    private String medtype;

    public Deal() {
    }

    public Deal(String diseases, String tabname, String desc, String medshop, String medtype) {
        Diseases = diseases;
        Tabname = tabname;
        this.desc = desc;
        this.medshop = medshop;
        this.medtype = medtype;

    }

    public String getDiseases() {
        return Diseases;
    }

    public void setDiseases(String diseases) {
        Diseases = diseases;
    }

    public String getTabname() {
        return Tabname;
    }

    public void setTabname(String tabname) {
        Tabname = tabname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMedshop() {
        return medshop;
    }

    public void setMedshop(String medshop) {
        this.medshop = medshop;
    }

    public String getMedtype() {
        return medtype;
    }

    public void setMedtype(String medtype) {
        this.medtype = medtype;
    }




}



