import java.time.Year;

/**
 * Created on 02.12.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class ResultEntity {

  double a0;
  double a1;
  double a2;

  double y;

  public ResultEntity(double a0, double a1, double a2, double y) {
    this.a0 = a0;
    this.a1 = a1;
    this.a2 = a2;
    this.y = y;
  }

  public double getA0() {
    return a0;
  }

  public double getA1() {
    return a1;
  }

  public double getA2() {
    return a2;
  }

  public double getY() {
    return y;
  }

  @Override
  public String toString() {
    return "ResultEntity{" +
        "a0=" + a0 +
        ", a1=" + a1 +
        ", a2=" + a2 +
        ", y=" + y +
        '}';
  }
}
