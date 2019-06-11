package com.trimind.training.day04;

public class ImagingCupRunner
{
    public static void main(String[] args)
    {
     ImagingCup ic = new ImagingCup();
     ic.setFeePerMember(50);
     ic.calcCollectionPerGroup();
        System.out.println(ic.calcCollectionPerGroup());
     System.out.println(ic.toString());


    }
}
