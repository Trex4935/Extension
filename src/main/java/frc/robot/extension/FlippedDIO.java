package frc.robot.extension;

import edu.wpi.first.wpilibj.DigitalInput;

// Extend the DigitalInput class
public class FlippedDIO extends DigitalInput {

    public FlippedDIO(int DIOPort) {
        // new up the DI object thru DigitalInput
        super(DIOPort);
    }

    // Return a value but flipped so that active = true
    public boolean get() {
        return !super.get();
    }
}
