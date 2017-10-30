package javaone2017.mlintro;

import org.apache.commons.math.stat.regression.SimpleRegression;

/**
 * Based on example at http://commons.apache.org/proper/commons-math/userguide/stat.html
 */
public class LinearRegressionApacheDemo {

    public static void main(String[] args) {
        double[][] data = { { 1, 3 }, {2, 5 }, {3, 7 }, {4, 14 }, {5, 11 }};
        SimpleRegression regression = new SimpleRegression();
        regression.addData(data);

        double intercept = regression.getIntercept();
        double slope = regression.getSlope();
        
        // displays intercept of regression line
        System.out.println(" y = " +slope+" * x +"+intercept);
            
        // predict
        double prediction = regression.predict(4);
        System.out.println("prediction: " + prediction);
     }

}
