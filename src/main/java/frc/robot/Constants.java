// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class Swerve{
    public static final int [] drivePorts= new int[]{1,2,3,4};
    public static final int [] steerPorts= new int[]{5,6,7,8};
    public static final int frontLeftIndex = 0;
    public static final int frontRightIndex = 1;
    public static final int backLeftIndex = 2;
    public static final int backRightIndex = 3;
  }
  public static class Intake{
    public static final int intakePort = 9;
  }
  public static class Climb{
    public static final int climbPort = 10;
  }
  public static class Shoot{
    public static final int shootPort = 11;
    public static final int transferPort = 12;
  }
}
