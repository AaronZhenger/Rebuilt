package team5427.frc.robot.subsystems.intake.io.sim;

import static edu.wpi.first.units.Units.Grams;
import static edu.wpi.first.units.Units.Inches;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.util.Units;
import org.dyn4j.geometry.Geometry;
import org.ironmaple.simulation.gamepieces.GamePieceOnFieldSimulation;

public class RebuiltBall extends GamePieceOnFieldSimulation {

  public static final GamePieceInfo INFINITE_RECHARGE_BALL_INFO =
      new GamePieceInfo(
          "Ball",
          Geometry.createCircle(Units.inchesToMeters(5.91) / 2),
          Inches.of(5.91),
          Grams.of(210),
          3.5,
          5,
          0.3);

  public RebuiltBall(Translation2d initialPosition) {
    super(INFINITE_RECHARGE_BALL_INFO, new Pose2d(initialPosition, new Rotation2d()));
  }
}
