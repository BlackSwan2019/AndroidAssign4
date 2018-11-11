package edu.niu.cs.z1806979.assign4;

/**
 *    Class:  TrafficLight
 *
 *    @author Ben Lane
 *    @author Jinhong Yao
 *
 *    Model that keeps track of what color to display on the traffic light.
 */
public class TrafficLight {

    /**
     * Constructor method.
     *
     */
    TrafficLight(){}

    /**
     * Method that gets traffic light color value.
     *
     * @param lightNum Number to test against to determine what color value to return.
     *
     */
    public String getLight(int lightNum) {
        switch (lightNum) {
            case 1:
                return "#1AFF1A";   // Return the color green.
            case 2:
                return "#FFFF00";   // Return the color yellow.
            case 3:
                return "#FF0000";   // Return the color red.
            default:
                return "#000000";   // Return default color black.
        }
    }

    /**
     * Method that gets traffic light color text.
     *
     * @param lightNum Number to test against to determine what label to return.
     *
     */
    public String getText(int lightNum) {
        switch (lightNum) {
            case 1:
                return "Green";   // Return the color green.
            case 2:
                return "Yellow";   // Return the color yellow.
            case 3:
                return "Red";   // Return the color red.
            default:
                return "Error";   // Return default color black.
        }
    }
}
