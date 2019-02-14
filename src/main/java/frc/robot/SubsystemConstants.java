package frc.robot;

public class SubsystemConstants {
    public interface hand
    {
        public static final double FORWARD = 0.5;
        public static final double BACKWARD = -0.5;
    }
    public interface intake
    {
        public static final double OUTTAKE = 1;
        public static final double INTAKE = -1;
    }
    public interface fork
    {
        public static final double OPEN_SPEED = 0.4;
        public static final double CLOSE_SPEED = -0.4;
    }

}
