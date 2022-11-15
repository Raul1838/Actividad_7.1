package ej7;

public class ContextSimple {
    private ClassifierStrategy classifierStrategy;

    public ContextSimple(ClassifierStrategy classifierStrategy){
        this.classifierStrategy = classifierStrategy;
    }

    public void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public void run(){
        classifierStrategy.classify();
    }
}
