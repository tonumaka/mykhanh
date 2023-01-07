package com.oop.collections.polynomials;

public interface Poly {
    int degree();
    double[] coefficient();
    Poly derivative();
}
