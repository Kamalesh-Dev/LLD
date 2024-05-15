package com.prototype;

public class IntelligentStudent extends Student{

    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent()
    {

    }

    public IntelligentStudent(IntelligentStudent other)
    {
        super(other);
        this.iq = other.iq;
    }

    @Override
    public IntelligentStudent copy()
    {
        return new IntelligentStudent(this);
    }
}
