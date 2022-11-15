package ej9;

public class ContextSimple {
    private ClassifierStrategy classifierStrategy;
    private Distance distance;

    public ContextSimple(ClassifierStrategy classifierStrategy, Distance distance){
        this.classifierStrategy = classifierStrategy;
        this.distance = distance;
    }

    public void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public void setDistance(Distance distance){
        this.distance = distance;
    }

    public void run(){
        distance.calculateDistance();
        classifierStrategy.classify();
    }
}
