package com.hibernate.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String certiLanguage;
    private double duration;
    
    public Certificate(String certiLanguage, double duration) {
        this.certiLanguage = certiLanguage;
        this.duration = duration;
    }

    public Certificate() {
    }

    public String getCertiLanguage() {
        return certiLanguage;
    }

    public void setCertiLanguage(String certiLanguage) {
        this.certiLanguage = certiLanguage;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    

}
