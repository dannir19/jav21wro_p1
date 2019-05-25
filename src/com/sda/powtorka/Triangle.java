package com.sda.powtorka;

public class Triangle implements IDrawable {

    public int sideC;

    public Triangle (int sideC) {
        this.sideC = sideC;

    }

    @Override
    public void draw() {
        for (int i=0; i<sideC; ++i){
            for (int j=0; j<=i; ++j)
                System.out.print("*");
            System.out.println();
        }
    }
}
