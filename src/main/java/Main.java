import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created on 02.12.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class Main {

  public static void main(String[] args) {

    System.out.println("Working...");

    System.out.println(check(-2, 2, 0.1, Main.reader("E:\\input.txt")));


  }

  public static double[][] reader(String filePath) {

    Path Path = Paths.get(filePath);
    Scanner scanner = null;
    try {
      scanner = new Scanner(Path);
    } catch (IOException e) {
      e.printStackTrace();
    }

    double[][] nums = new double[10][10];
    int i = 0;
    int j = 0;
    while (scanner.hasNext()) {
      if (scanner.hasNextDouble()) {
        nums[j][i] = scanner.nextDouble();
        System.out.println("" + nums[j][i] + " j" + j + " i" + i);
        i++;
        if (i == 10) {
          i = 0;
          j++;
        }
      } else {
        scanner.next();
      }
    }

    return nums;

  }

  public static ResultEntity check(double min, double max, double d, double[][] array) {
    ArrayList<ResultEntity> result = new ArrayList<>();
    double sum = 0;
    for (double a0 = min; a0 <= max; a0 += d) {
      for (double a1 = min; a1 <= max; a1 += d) {
        for (double a2 = min; a2 <= max; a2 += d) {
          for (int x1a = 0; x1a < array.length; x1a++) {
            for (int x1b = 0; x1b < array.length; x1b++) {
              for (int x2a = 0; x2a < array.length; x2a++) {
                for (int x2b = 0; x2b < array.length; x2b++) {
                  sum += a0 + a1 * array[x1a][x1b] + a2 * array[x2a][x2b];
                }
              }
            }
          }
          result.add(new ResultEntity(a0, a1, a2, sum));
          sum = 0;
        }
      }
    }
    return result.stream().min(Comparator.comparingDouble(ResultEntity::getY)).get();
  }
}


    
