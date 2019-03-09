package com.thisisbensilver.animalinfo;

import java.io.Serializable;

public class Animal implements Serializable {

    private String aType = "";
    private int aLegs = 0;
    private boolean aTerror = false;
    private int aTerrorLvl = 0;
    private String aDetails = "";

    public Animal(String type, int legs, boolean terror, int terrorLvl, String details) {
        aType = type;
        aLegs = legs;
        aTerror = terror;
        aTerrorLvl = terrorLvl;
        aDetails = details;
    }

    public Animal(String type, int legs, boolean terror, String details) {
        aType = type;
        aLegs = legs;
        aTerror = terror;
        aTerrorLvl = 0;
        aDetails = details;
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType;
    }

    public int getaLegs() {
        return aLegs;
    }

    public void setaLegs(int aLegs) {
        this.aLegs = aLegs;
    }

    public boolean getaTerror() {
        return aTerror;
    }

    public void setaTerror(boolean aTerror) {
        this.aTerror = aTerror;
    }

    public int getaTerrorLvl() {
        return aTerrorLvl;
    }

    public void setaTerrorLvl(int aTerrorLvl) {
        this.aTerrorLvl = aTerrorLvl;
    }

    public String getaDetails() {
        return aDetails;
    }

    public void setaDetails(String aDetails) {
        this.aDetails = aDetails;
    }

    public String toString(){
        return ("This " + aType + " has " + aLegs + " leg(s) and a TERROR LEVEL of " + aTerrorLvl + ".\nYou should also know:\n" + aDetails);
    }
}
