package com.deva.gurugeektutors;

public class Tutor {
    private String tutorName;
    private int tutorImage;
    private  String tutorBio;

    public String getTutorBio() {
        return tutorBio;
    }

    public void setTutorBio(String tutorBio) {
        this.tutorBio = tutorBio;
    }

    public Tutor(String tutorName, int tutorImage, String tutorBio){
        this.tutorImage = tutorImage;
        this.tutorName = tutorName;
        this.tutorBio = tutorBio;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public int getTutorImage() {
        return tutorImage;
    }

    public void setTutorImage(int tutorImage) {
        this.tutorImage = tutorImage;
    }
}
