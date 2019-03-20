package com.thisisbensilver.animalinfo;

import java.io.Serializable;

public class Animal implements Serializable {

    private String aType = "";
    private int aLegs = 0;
    private boolean aTerror = false;

    public Animal(String type, int legs, boolean terror) {
        aType = type;
        aLegs = legs;
        aTerror = terror;

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


    public String toString(){

        String r = aType + "- the " + aLegs + " legged creature!";

        if (aTerror) {
            r = aType + "- the VERY SCARY, " + aLegs + " legged creature!";
        }

        return r;
    }
}
