package javaone2017.mlintro;

import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.Instance;
import weka.core.Instances;
import weka.classifiers.functions.LinearRegression;

/**
 * Based on example https://www.packtpub.com/books/content/regression-models-weka
 * 
 */
public class LinearRegressionWekaDemo {

    public static void main(String args[]) throws Exception {
        //load data
        Instances data = new Instances(new BufferedReader(new FileReader("house.arff")));
        data.setClassIndex(data.numAttributes() - 1);
        
        //build model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(data); 
                       
        System.out.println(model);

        // get coefficients
         double[] coeff = model.coefficients();        
        
        //classify the last instance
        Instance myHouse = data.lastInstance();
        double price = model.classifyInstance(myHouse);
        System.out.println("My house (" + myHouse + "): " + price);                
    }
}
