package frc.robot;

public class SubsystemConstants {
    public interface hand
    {
        public static final double FORWARD = 1;
        public static final double BACKWARD = -1;
    }
    public interface intake
    {
        public static final double OUTTAKE = 0.8;
        public static final double INTAKE = -0.8;
    }
    public interface fork
    {
        public static final double OPEN_SPEED = 0.4;
        public static final double CLOSE_SPEED = -0.4;
    }

}
