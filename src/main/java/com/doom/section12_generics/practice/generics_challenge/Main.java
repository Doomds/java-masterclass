package com.doom.section12_generics.practice.generics_challenge;

public class Main {
    public static void main(String[] args) {
//        System.out.println("-".repeat(30));
//
//        Park park = new Park("Grand Canyon", "47.2160, -95.2348");
//        River river = new River("Mississipi",
//                "47.2160, -95.2348",
//                "35.1556, -90.0659",
//                "29.1566, -89.2495"
//        );
//
//        Layer layer1 = new Layer<Mappable>();
//        layer1.addElements(river, park);
//        layer1.renderLayer();
//
//        System.out.println("-".repeat(30));
//
//        Park park1 = new Park("Parc d'Enghien", "97.2160, -105.2348");
//        River river1 = new River("la Seine",
//                "57.2160, -105.2348",
//                "45.1556, -100.0659",
//                "39.1566, -99.2495"
//        );
//
//        Layer<Park> layer2 = new Layer<>();
//        layer2.addElements(river1, park1);
//        layer2.renderLayer();
//
//        System.out.println("-".repeat(30));
//
//        layer2.addElements(river, park);
//        layer2.renderLayer();
//
//        System.out.println("-".repeat(30));
//
//        Park park2 = new Park("Ter Rijst", "197.2160, -205.2348");
//        layer1.addElement(park2);
//        layer1.renderLayer();

        System.out.println("-".repeat(30));
        System.out.println("-".repeat(30));

        var nationalUSParks = new Park[]{
                new Park("Yosemite", "37.8651, -119.5383"),
                new Park("Yellowstone", "44.4280, -110.5885"),
                new Park("Grand Canyon", "36.0544, -112.1401")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var allRivers = new River[]{
                new River(
                        "Mississipi",
                        "47.2160, -95.2348",
                        "35.1556, -90.0659",
                        "29.1566, -89.2495"
                ),
                new River(
                        "la Seine",
                        "57.2160, -105.2348",
                        "45.1556, -100.0659",
                        "39.1566, -99.2495"
                )
        };

        Layer<River> riverLayer = new Layer<>(allRivers);
        riverLayer.renderLayer();

    }
}
