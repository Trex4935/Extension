// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.extension.Falcon;
import frc.robot.extension.SparkMax;
import frc.robot.extension.Talon;

public class Drivetrain extends SubsystemBase {
  WPI_TalonSRX talon;
  TalonFX falcon;
  CANSparkMax neo;
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    talon = Talon.createDefaultTalon(0);
    falcon = Falcon.createDefaultFalcon(1);
    neo = SparkMax.createDefaultCANSparkMax(2);
  }

  public void driveNEO() {
    neo.set(0.4);
  }

  public void driveFalcon() {
    falcon.set(0.4);
  }

  public void driveTalon() {
    talon.set(0.4);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
