package com.doom.section12_generics.practice.generics_challenge;

import javax.lang.model.util.Elements;
import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> layerElements;

    public Layer(T[] elements) {
        this.layerElements = new ArrayList<>(List.of(elements));
    }

    public void addElement(T t) {
        this.layerElements.add(t);
    }

    public void addElements(T... elements) {
        this.layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for(T t : layerElements) {
            t.render();
        }
    }
}
