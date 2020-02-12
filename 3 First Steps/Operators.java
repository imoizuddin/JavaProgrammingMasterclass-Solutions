package com.company;

public class Operators {

    public static void main(String[] args) {
        double d1=20.00;
        double d2=80.00;
        double d3, remainder;
        boolean bvariable;

        d3 = (d1 + d2) * 100.00;
        remainder= d3 % 40.00;

        if (remainder==0){
            bvariable=true;
        }
        else {
            bvariable=false;
        }
        System.out.println(bvariable);

        if(!bvariable){
            System.out.println(" Got Some Remainder");
        }

    }
}
