// Last updated: 3/9/2026, 11:54:40 AM
/*
 * Easy math problem.
 * All conversions are given.
*/

1class Solution {
2public:
3    vector<double> convertTemperature(double celsius) {
4        vector<double> result;
5        double kelvin = celsius + 273.15;
6        double fahrenheit = celsius * 1.80 + 32.00;
7        result.push_back(kelvin);
8        result.push_back(fahrenheit);
9        return result;
10    }
11};