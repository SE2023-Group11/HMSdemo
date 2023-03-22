package com.hmsdemo.pojo;

public class Patient {
    private int pid;
    private String pname;

    public Patient(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public Patient() {

    }

    @Override
    public String toString() {
        return "Patient{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
