package frc.robot;

public class SubsystemConstants {
    public interface hand
    {
        public static final double FORWARD = 0.7;
        public static final double BACKWARD = -0.4;
        public static final double STALL_BACKWARD = 0.15;
        public static final double STALL_FORWARD = -0.15;
    }
    public interface intake
    {
        public static final double OUTTAKE = 0.5;
        public static final double INTAKE = -0.6;
    }

    public interface fork
    {
        public static final double OPEN_SPEED = 0.3;
        public static final double CLOSE_SPEED = -0.2;
        public static final double STALL_SPEED = 0.15;
    }

}
