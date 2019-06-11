package com.trimind.training.day04;

import java.util.Collection;

public class ImagingCup
{
    public String groupName;
    public String projectTitle;
    public  int noOfMembers;
    public double feePerMember;


    public ImagingCup() {
        this.groupName = "kotla";
        this.projectTitle = "xyz";
        this.noOfMembers = 4;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double getFeePerMember() {
        return feePerMember;
    }

    public void setFeePerMember(double feePerMember) {
        this.feePerMember = feePerMember;
    }
    public  double calcCollectionPerGroup(){
       double CollectionperGroup = feePerMember * noOfMembers;
       return  CollectionperGroup;
    }

    @Override
    public String toString() {
        return "ImagingCup{" +
                "groupName='" + groupName + '\'' +
                ", projectTitle='" + projectTitle + '\'' +
                ", noOfMembers=" + noOfMembers +
                ", feePerMember=" + feePerMember +
                '}';
    }
}
