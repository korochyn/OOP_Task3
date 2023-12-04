package Apteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Лекарство
public class Pharmacy implements Iterable<PharmancyComponent>, Comparable<Pharmacy> {

    private List<PharmancyComponent> components = new ArrayList<>();
    private int index = 0;
    private int power = 0;

    public Pharmacy addComponent(PharmancyComponent component) {
        this.power = this.power + component.getPower();
        components.add(component);
        return this;
    }

    public List<PharmancyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmancyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // @Override
    // public boolean hasNext() {
    // return index < components.size();
    // }
    //
    // @Override
    // public PharmancyComponent next() {
    // return components.get(index++);
    // }

    @Override
    public String toString() {
        return "\r Это лекарство имеет силу " + this.power +
                " и состоит из " + components +
                ", index=" + index +
                '}';
    }

    // вынесенный класс Iterable
    // @Override
    // public Iterator<PharmancyComponent> iterator() {
    // return new IteratorComponent(this);
    // }

    // анонимный класс Iterable
    @Override
    public Iterator<PharmancyComponent> iterator() {
        return new Iterator<PharmancyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmancyComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pharmacy oo = (Pharmacy) o;
        return power == oo.power;
    }


    @Override
    public int hashCode(){
        return this.power;
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (this.power > o.power) {
            return -1;
        } else if (this.power < o.power) {
            return 1;
        }
        return 0;
    }
}
