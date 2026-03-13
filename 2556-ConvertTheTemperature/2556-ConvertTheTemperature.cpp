// Last updated: 3/13/2026, 8:16:19 PM
class Solution {
public:
    vector<double> convertTemperature(double celsius) {
        vector<double> result;
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        result.push_back(kelvin);
        result.push_back(fahrenheit);
        return result;
    }
};