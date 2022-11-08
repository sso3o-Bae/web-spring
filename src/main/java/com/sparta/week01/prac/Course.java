package com.sparta.week01.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!
    public String title;
    public String tutor;
    public int days;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutor() {
        return this.tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //기본 생성자
    public Course(){

    }

    //생성자
    public Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }
}