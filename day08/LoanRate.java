package com.trimind.training.day08;

public class LoanRate extends Book
{
   public double OverDuerateAcademic;
   public double OverDuerateNonAcademic;
   private static double amount=1.0;
   private static double overdueAmount;

    public static void setAmount(int days) {
        amount= amount*days;

    }

    public static double getAmount() {
        return amount;
    }

    public static double getOverDueAmount() {
        return  overdueAmount;
    }

    public double getOverDuerateAcademic() {
        return OverDuerateAcademic;
    }

    public double getOverDuerateNonAcademic() {
        return OverDuerateNonAcademic;
    }
    public double countoverDueRateAcademic(){
        return 0;
    }
    public double countoverDueRateNonAcaademic(){
        return 1;
    }


    @Override
    public String toString() {
        return "LoanRate{" +
                "OverDuerateAcademic=" + OverDuerateAcademic +
                ", OverDuerateNonAcademic=" + OverDuerateNonAcademic +
                '}';
    }
}
