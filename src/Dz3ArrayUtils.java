
import java.math.BigDecimal;

public class Dz3ArrayUtils {

    int[] massive;

    Dz3ArrayUtils(int[] massive) {
        this.massive = massive;
    }

    public int Min() {
        int min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (min > massive[i])
                min = massive[i];

        }
        return min;

    }
    public int Max() {
        int max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (max < massive[i])
                max = massive[i];

        }
        return max;
    }

    public BigDecimal Average() {
        double sum = massive[0];
        for (int i = 1; i < massive.length; i++) {
            sum += massive[i];
        }
        double average = sum / massive.length;
        BigDecimal newaverage = new BigDecimal(average);
        newaverage = newaverage.setScale(2, BigDecimal.ROUND_HALF_UP);
        return newaverage;
    }
}