package com.example.school;

public class registation_details {
    public String edtfullname="", edtguardianname="", edtclass="", edtsection="",
            edtmobilenumber="", edtemailid="", edtpassword="";

    public registation_details(){}

    public registation_details(String edtfullname, String edtguardianname, String edtclass, String edtsection, String edtmobilenumber, String edtemailid, String edtpassword) {
        this.edtfullname = edtfullname;
        this.edtguardianname = edtguardianname;
        this.edtclass = edtclass;
        this.edtsection = edtsection;
        this.edtmobilenumber = edtmobilenumber;
        this.edtemailid = edtemailid;
        this.edtpassword = edtpassword;
    }

    public String getEdtfullname() {
        return edtfullname;
    }

    public void setEdtfullname(String edtfullname) {
        this.edtfullname = edtfullname;
    }

    public String getEdtguardianname() {
        return edtguardianname;
    }

    public void setEdtguardianname(String edtguardianname) {
        this.edtguardianname = edtguardianname;
    }

    public String getEdtclass() {
        return edtclass;
    }

    public void setEdtclass(String edtclass) {
        this.edtclass = edtclass;
    }

    public String getEdtsection() {
        return edtsection;
    }

    public void setEdtsection(String edtsection) {
        this.edtsection = edtsection;
    }

    public String getEdtmobilenumber() {
        return edtmobilenumber;
    }

    public void setEdtmobilenumber(String edtmobilenumber) {
        this.edtmobilenumber = edtmobilenumber;
    }

    public String getEdtemailid() {
        return edtemailid;
    }

    public void setEdtemailid(String edtemailid) {
        this.edtemailid = edtemailid;
    }

    public String getEdtpassword() {
        return edtpassword;
    }

    public void setEdtpassword(String edtpassword) {
        this.edtpassword = edtpassword;
    }
}
