package com.example.jbt.parcel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jbt on 05/12/2017.
 */

public class Student implements Parcelable {

    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }


    //needed for parcelable implementation. happens automatically
    //For inner implementation
    protected Student(Parcel in) {
        name = in.readString();
        grade = in.readInt();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(grade);
    }
}
