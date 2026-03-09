// Last updated: 3/9/2026, 11:57:32 AM
/*
 * Easy math problem.
 * All conversions are given.
*/

1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double kelvin = celsius + 273.15;
4        double fahrenheit = celsius * 1.80 + 32.00;
5        double[] arr = new double[2];
6        arr[0] = kelvin;
7        arr[1] = fahrenheit;
8        return arr;
9    }
10}