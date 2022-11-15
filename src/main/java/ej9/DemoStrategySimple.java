package ej9;

public class DemoStrategySimple {
    public static void main(String[] args) {

        System.out.println("--- KNN with Euclidean distance---");
        ContextSimple context = new ContextSimple(new ClassifierKnn(), new Euclidean());
        context.run();

        System.out.println("--- KNN with Manhattan distance---");
        context.setDistance(new Manhattan());
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.run();

        System.out.println("--- SOM with Euclidean distance --- ");
        context.setDistance(new Euclidean());
        context.setClassifierStrategy(new ClassifierSOM());
        context.run();
    }

}
