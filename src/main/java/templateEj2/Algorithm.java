package templateEj2;

import templateEj2.model.Point;

import java.util.ArrayList;
import java.util.List;

public abstract class Algorithm<T> {
    private List<List<Point>> groups;

    Algorithm(){
        groups = new ArrayList<>();
    }


    final void execute(T sample){
        clasify(getValue(sample));
    }

    final int clasify(Point sample){
        System.out.println("Sacar al grupo al que pertenece");
        return 0;
    }

    final void setInitGroups(List<List<Point>> groups){
        System.out.println("Grupos iniciales para poder hacer la comparación de distancias");
        this.groups = groups;
    }

    final double getEuclideanDistance(Point p0, Point p1){
        System.out.println("Sacar la distancia entre dos puntos");
        return 0.0;
    }

    abstract Point getValue(T sample);


}
