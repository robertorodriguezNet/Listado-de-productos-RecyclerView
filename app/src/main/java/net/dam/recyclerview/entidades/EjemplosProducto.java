package net.dam.recyclerview.entidades;

import java.util.ArrayList;

/**
 * Clase con un método estático que carga productos de ejemplo
 */

public class EjemplosProducto {

    /**
     * Cargamos unos productos de ejemplo.
     * Los productos son reales.
     */
    public static ArrayList<Producto> cargarEjemplos(){

        ArrayList<Producto> dataSet = new ArrayList<>();
        //https://drive.google.com/uc?export=view&id=
        dataSet.add (new Producto("8437003018008","Agua Mineral Natural Aguadoy 8L",1,1,8,3, "https://drive.google.com/uc?export=view&id=10lvjx2dzbiOnIuycj6GqngzKTPhCPDyT"));
        dataSet.add (new Producto("8480024764904","Picatostes alteza ajo 75gr",2,1, (float) 0.075,2, "https://drive.google.com/uc?export=view&id=10LmLhuhcjv_WJ4yblOa7lyadhROihD7i"));
        dataSet.add (new Producto("8480024820594","Mix de verduras microondas 300g",2,1, (float) 0.3,2, "https://drive.google.com/uc?export=view&id=10ctqigBsXijf3PibhZ1gYp_v10noyrin"));
        dataSet.add (new Producto("8413876251166","ensalada cesar",3,1, (float) 0.4,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8413876277388","Tortilla patatas carrefour",3,1, (float) 0.6,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8431876231694","Salmón ahumado 200gr",3,1, (float) 0.2,2, "https://drive.google.com/uc?export=view&id=10mJ1biZ5yzM2jdqtRSGfEW06ksxQzEzM"));
        dataSet.add (new Producto("8431876296013","Alcohol limpieza carrefour",3,1, (float) 0.4,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8410500008871","bifidus activia desnatado natural, danone, pack 8 x 120 g - 960 g",4,8, (float) 0.96,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8410500013479","bifidus activia desnatado natural, danone, pack 12 x 120 g - 1440 g",4,12, (float)1.44,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8412598000478","Estrella Galicia Cerveza sin alcohol (0,0% Vol.) Lata de 33 centilitros",5,1, (float) 0.33,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8414516193476","ensalada gourmet",6,1, (float) 0.4,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("1000087865444","platano",7,0,0,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("1000087879877","tomate",7,0,0,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("1000534544656","melocotón amarillo",7,0,0,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8437004621061","ensalada 4 estaciones (lechuga iceberg, zanahoria, col lombarda), hacendado, bolsa 250 g",8,1, (float) 0.25,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8437004621535","VERDURA 3 VEGETALES MIX DE 3 VERDURAS BRÓCOLI, COLIFLOR, ZANAHORIA FRESCO (PARA MICROONDAS), VERDIFRESH, BOLSA 300 g",8,1, (float) 0.3,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000049544","VINAGRE BALSAMICO DE MODENA, HACENDADO, BOTELLA CRISTAL 250 ml",8,1, (float) 0.25,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000053329","Lenteja Pardina Hacendado 295 g",8,1, (float) 0.21,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000103833","leche desnatada",8,1,6,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000180025","Atún Claro Aceite Oliva Hacendado Pack-6 480 GR",8,6, (float) 0.36,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000221636","cafe soluble natural classic, hacendado, tarro 200 g",8,1, (float) 0.2,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000260284","Alubia Blanca Hacendado 295 g",8,1, (float) 0.21,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000260390","GARBANZO COCIDO, HACENDADO, TARRO 570 g ESCURRIDO 400 g",8,1, (float) 0.21,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000392169","Zumo de melocotón y uva 6x200ml",8,6, (float)1.2,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000505460","Queso havarti light",8,1, (float) 0.3,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000512239","Queso untar light",8,1, (float) 0.3,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000592477","PECHUGA PAVO FINAS LONCHAS CONTENIDO REDUCIDO de SAL",8,1, (float) 0.225,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000823021","pan molde de centeno, hacendado, paquete 14 rebanadas - 720 g",8,14, (float) 0.72,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000826091","PANECILLO CHOCOBUNS CON PEPITAS CHOCOLATE INDUSTRIAL, HACENDADO, PAQUETE 6 u - 250 g",8,6, (float) 0.25,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000827876","Picatoste Frito en aceite de girasol sabor ajo",8,1, (float) 0.1,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8480000837837","panecillo horno, hacendado, paquete 11 u - 495 g",8,11, (float) 0.495,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8411396000734","flautas pollo y queso, pinchos jovi, paquete 2 u - 273 g",9,2, (float) 0.273,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8717163889169","Crema campesina 500ml",10,1, (float) 0.5,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8410283001106","Gaseosa la casera 0,5l",1,1, (float) 0.5,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8410505272017","Garbanzo cocido Luengo 400g",12,1, (float) 0.4,3, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("1000045787878","Huevos lugareño 12 XL",13,12,12,1, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8410091180048","Café Marcilla molido mezcla",14,1, (float) 0.25,2, "https://drive.google.com/uc?export=view&id="));
        dataSet.add (new Producto("8437003894275","Paleta Curada Lonchas Paletas Marpa 240g Bipack",15,1, (float) 0.24,2, "https://drive.google.com/uc?export=view&id="));

        return dataSet;
    }
}
