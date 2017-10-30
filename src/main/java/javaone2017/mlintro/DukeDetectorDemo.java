package javaone2017.mlintro;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Convolutional Neural Network that learns to detect Duke images.
 *
 * @author Zoran Sevarac <zoran.sevarac@deepnetts.com>
 */
public class DukeDetectorDemo {

//    static final Logger LOGGER = Logger.getLogger(DeepNetts.class.getName());
//
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        int imageWidth = 64;
//        int imageHeight = 64;
//
//        String labelsFile = "/home/zoran/datasets/DukeSet/labels.txt";
//        String trainingFile = "/home/zoran/datasets/DukeSet/train.txt";
//        String testFile = "/home/zoran/datasets/DukeSet/test.txt";
//        
//        ImageSet imageSet = new ImageSet(imageWidth, imageHeight);
//
//        LOGGER.info("Loading images...");
//
//        imageSet.loadLabels(new File(labelsFile));
//        imageSet.loadImages(new File(trainingFile));
////        imageSet.invert();
////        imageSet.zeroMean();
//        imageSet.shuffle();
//
//        LOGGER.info("Done!");
//        
//        LOGGER.info("Creating neural network...");
//
//        ConvolutionalNetwork dukeNet = new ConvolutionalNetwork.Builder()
//                .inputLayer(imageWidth, imageHeight, 3)
//                .convolutionalLayer(5, 5, 1, ActivationType.TANH)
//                .maxPoolingLayer(2, 2, 2)
//                .fullyConnectedLayer(10, ActivationType.TANH)
//                .outputLayer(1, OutputLayer.class)
//                .lossFunction(BinaryCrossEntropyLoss.class)
//                .build();
//
//        dukeNet.setOutputLabels(imageSet.getLabels());
//
//        LOGGER.info("Done!");
//        LOGGER.info("Training neural network");
//
//        // create a set of convolutional networks and do training, crossvalidation and performance evaluation
//        BackpropagationTrainer trainer = new BackpropagationTrainer(dukeNet);
//        trainer.setLearningRate(0.01f)
//                .setMomentum(0.2f)
//                .setMaxError(0.02f)
//                .setBatchMode(false)
//                .setOptimizer(OptimizerType.MOMENTUM);
//        trainer.train(imageSet);
//
//        // to save neural network to file on disk
//        FileIO.writeToFile(dukeNet, "DukeDetector.dnet");
//
//        ClassifierEvaluator evaluator = new ClassifierEvaluator();
//        evaluator.evaluate(dukeNet, imageSet);
//        System.out.println(evaluator);
//
//        // to use recognizer for single image
//        BufferedImage image = ImageIO.read(new File("/home/zoran/datasets/DukeSet/duke/duke7.jpg"));
//        ImageRecognizer imageRecognizer = new DeepNettsImageRecognizer(dukeNet);
//        List<RecognitionResult> results = imageRecognizer.recognize(image);
//        System.out.println(results.toString());
//
//        // test negative/ negative example
//        image = ImageIO.read(new File("/home/zoran/datasets/DukeSet/negative/noisy_0.jpg"));
//        results = imageRecognizer.recognize(image);
//        System.out.println(results.toString());
//    }
}