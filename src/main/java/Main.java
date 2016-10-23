import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.linear.LinearSystemSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.vector.dense.BasicVector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Solving matrix with la4j open source library");

        double[][] matrix = new double[][]{{2,3},{5,1}};
        double[] vector = new double[]{8, 7};

        Matrix a = new Basic2DMatrix(matrix);
        Vector v = new BasicVector(vector);

        System.out.println("Solving \n" + a + " * <" + v + ">");

        LinearSystemSolver solver = new GaussianSolver(a);
        Vector x = solver.solve(v);

        System.out.println("Result: <" + x + ">");

    }
}
