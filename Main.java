package Apteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        PharmancyComponent azitroment = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent azitroment1 = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmancyComponent water = new Water("Water", "10 Мг", 20);
        PharmancyComponent water2 = new Water("Water", "10 Мг", 20);

        List<PharmancyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);

        // System.out.println(pharmancyComponents);

        // Collections.sort(pharmancyComponents);
        // System.out.println(pharmancyComponents);

        Pharmacy pharmacy0 = new Pharmacy().addComponent(pinicilin).addComponent(water);
        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitroment).addComponent(water).addComponent(azitroment1);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(water);
        Pharmacy pharmacy3 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy4 = new Pharmacy().addComponent(pinicilin).addComponent(water);
        Pharmacy pharmacy5 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy6 = new Pharmacy().addComponent(pinicilin).addComponent(water);
        Pharmacy pharmacy7 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy8 = new Pharmacy().addComponent(pinicilin).addComponent(water).addComponent(azitroment1);
        Pharmacy pharmacy9 = new Pharmacy().addComponent(azitroment).addComponent(water);

        // for (PharmancyComponent comp : pharmacy1) {
        // System.out.println(comp.getName());
        // }
        System.out.println("Список без сортировки");
        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy0);
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        pharmacies.add(pharmacy4);
        pharmacies.add(pharmacy5);
        pharmacies.add(pharmacy6);
        pharmacies.add(pharmacy7);
        pharmacies.add(pharmacy8);
        pharmacies.add(pharmacy9);
        System.out.println("pharmacies = " + pharmacies);
        System.out.println("Сортировка по силе лекарства (считаем его как суммарную силу всех компонентов)");
        Collections.sort(pharmacies);
        System.out.println("pharmacies = " + pharmacies);
        System.out.println("Количество уникальных элементов");
        Set<Pharmacy> pharmaciesSet = new HashSet<>();
        pharmaciesSet.add(pharmacy0);
        pharmaciesSet.add(pharmacy1);
        pharmaciesSet.add(pharmacy2);
        pharmaciesSet.add(pharmacy3);
        pharmaciesSet.add(pharmacy4);
        pharmaciesSet.add(pharmacy5);
        pharmaciesSet.add(pharmacy6);
        pharmaciesSet.add(pharmacy7);
        pharmaciesSet.add(pharmacy8);
        pharmaciesSet.add(pharmacy9);
        System.out.println("pharmacies = " + pharmacies);
        System.out.println("Количество уникальных элементов = " + pharmaciesSet.size());

        // Set<PharmancyComponent> set = new HashSet<>();
        // set.add(azitroment);
        // set.add(azitroment1);
        // set.add(azitroment);

        // System.out.println("/////////////////////////");
        // System.out.println(set);

        // Collections.sort(pharmacies, new );

        // Iterator<PharmancyComponent> iterator = pharmacy1;

        // while (iterator.hasNext()){
        // System.out.println(iterator.next());
        // }

        // while (((Iterator<PharmancyComponent>) pharmacy1).hasNext()) {
        // System.out.println(((Iterator<PharmancyComponent>) pharmacy1).next());
        // }

    }
}
