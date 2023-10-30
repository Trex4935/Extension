// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.extension;

/** Add your docs here. */
public class Helper {

    //
    /**
     * Determine if a value is between a max and min
     *
     * @param maximum
     *                Maximum value in the comparison range
     * 
     * @param minimum
     *                Minimum value in the comparison range
     * 
     * @param value
     *                Value to be compared
     * 
     * @return Boolean if the value is within range
     */

    public static boolean RangeCompare(double maximum, double minimum, double value) {
        if (value >= minimum && value <= maximum) {
            return true;
        } else {
            return false;
        }

    }

    // https://stackoverflow.com/questions/45316947/converting-between-180-180-to-0-360
    public static double ConvertTo360(double angle) {
        return (angle + 360) % 360;
    }

}