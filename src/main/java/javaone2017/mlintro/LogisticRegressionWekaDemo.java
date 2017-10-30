package javaone2017.mlintro;

import java.io.BufferedReader;
import java.io.FileReader;
import org.apache.commons.math.stat.regression.SimpleRegression;
import weka.classifiers.functions.Logistic;
import weka.classifiers.functions.SimpleLogistic;
import weka.core.Instances;

public class LogisticRegressionWekaDemo {

    public static void main(String[] args) throws Exception {                   
        Instances dataSet = new Instances(new BufferedReader(new FileReader("breast-cancer.arff")));
        dataSet.setClassIndex(dataSet.numAttributes() - 1);        
        dataSet.setClassIndex(1);

        Logistic log = new Logistic();
        log.buildClassifier(dataSet);
        
        System.out.println(log);
    }
    
}
