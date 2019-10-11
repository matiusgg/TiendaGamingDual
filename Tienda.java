
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tienda {

// Lista Armas de fuego

    ArrayList<ArmasDeFuego> armasDeFuegosLista = new ArrayList<>();

    // Lista Balas

    ArrayList<Balas> balasLista = new ArrayList<>();

    // Lista Cuerpo a cuerpo

    ArrayList<CuerpoACuerpo> cuerpoACuerposLista = new ArrayList<>();

    // Lista Granada

    ArrayList<Granadas> granadasLista = new ArrayList<>();

    // Lista Especiales

    ArrayList<Especiales> especialesLista = new ArrayList<>();

    // atributo Scanner para no tener que crer una variable de scanner cada vez que creamos un nuevo metodo.

    private Scanner sc = new Scanner(System.in);

public void creacionObjetos() {

    // Armas de fuego

    ArmasDeFuego escopeta = new ArmasDeFuego("escopeta x4000", 2000, 5000.0, "nueva", 23, "despacio", 100, 5.0, 50, 300.0, 40);

    // Balas

    Balas balax3 = new Balas("balasx3", 200, 400, "disponible", 10000, 10, 1);

    // Cuerpo a Cuerpo

    CuerpoACuerpo machete = new CuerpoACuerpo("macheteForce", 4000, 1800, "disponible", 300, 10.0);

    // Especiales

    Especiales ballesta = new Especiales("Ballesta x4000", 3000, 6000, "Disponible", 25, 25.5);

    // Granadas

    Granadas granadaG = new Granadas("GranadaGrande", 2000, 900, "Disponible", 1000, 5.5, 6.2, "Te destruye");

    // ******************************************************

    ArmasDeFuego M416 = new ArmasDeFuego("M416",43,620.85, "Nueva",4286,"automatica",
            250, 0.085, 35, 5.56, 1.34);
    ArmasDeFuego M16A4 = new ArmasDeFuego("M16A4",43, 730.75, "Nueva", 8467, "automatica",
            300, 0.075, 35, 5.56, 1.28);
    ArmasDeFuego SCARL = new ArmasDeFuego("SCAR-L", 43, 724, "Nueva", 7397, "automatica",
            400, 0.0096, 40, 5.56, 1.89);
    ArmasDeFuego AKM = new ArmasDeFuego("AKM", 49, 965.75, "Segunda mano", 12954, "automatica",
            900, 0.1, 40, 7.62, 3.65);
    ArmasDeFuego GROZA = new ArmasDeFuego("Groza", 49, 863.65, "Nueva", 12465, "automatica",
            200, 0.080, 40, 7.62, 2.53);
    ArmasDeFuego MK47 = new ArmasDeFuego("MK 47 Mutant", 49, 968.35, "Nueva", 8472, "automatica",
            500, 0.1, 30, 7.62, 3.64);
    ArmasDeFuego QBZ95 = new ArmasDeFuego("QBZ95", 43, 586.45, "Segunda mano", 6458, "automatica",
            400, 0.092, 40, 5.56, 2.634);
    ArmasDeFuego AUGA3 = new ArmasDeFuego("AUG 43", 43, 548.65, "Nueva", 5937, "automatica",
            500, 0.085, 50, 5.56, 1.53);
    ArmasDeFuego BERYLM762 = new ArmasDeFuego("Beryl M762", 47, 935.65, "Nueva", 14735, "rafaga",
            500, 0.086, 40, 7.62, 1.64);
    ArmasDeFuego G36C = new ArmasDeFuego("G36C", 43, 485.25, "Nueva", 34256, "automatica",
            400, 0.086, 40, 5.56, 1.43);
    ArmasDeFuego TOMMYGUN = new ArmasDeFuego("Tommy Gun", 40, 1435, "Segunda mano", 6947, "automatica",
            200, 0.086, 50, 45, 12.65);
    ArmasDeFuego MICROUZI = new ArmasDeFuego("Micro UZI", 26, 265.35, "Nueva", 6584, "automatica",
            200, 0.048, 35, 9, 1.48);

    // *******************************************************


    // Agregar los objetos a la lista:

    // lista armas de fuego

    armasDeFuegosLista.add(escopeta);
    armasDeFuegosLista.add(M416);
    armasDeFuegosLista.add(M16A4);
    armasDeFuegosLista.add(SCARL);
    armasDeFuegosLista.add(AKM);
    armasDeFuegosLista.add(GROZA);
    armasDeFuegosLista.add(MK47);
    armasDeFuegosLista.add(QBZ95);
    armasDeFuegosLista.add(AUGA3);
    armasDeFuegosLista.add(BERYLM762);
    armasDeFuegosLista.add(G36C);
    armasDeFuegosLista.add(TOMMYGUN);
    armasDeFuegosLista.add(MICROUZI);

    // lista balas

    balasLista.add(balax3);

    // Cuerpo a Cuerpo

    cuerpoACuerposLista.add(machete);

    // Especiales

    especialesLista.add(ballesta);

    // Granadas

    granadasLista.add(granadaG);

}

// *******************************************************

public void catalogoArmasFuego() {

    this.creacionObjetos();

    for (ArmasDeFuego valor: armasDeFuegosLista) {

        System.out.println(valor.toString());
    }
}


// *******************************************************

    public void catalogoBalas() {

        this.creacionObjetos();

        for (Balas valor: balasLista) {

            System.out.println(valor.toString());
        }
    }


    // *******************************************************

    public void catalogoCuerpoACuerpo() {

        this.creacionObjetos();

        for (CuerpoACuerpo valor: cuerpoACuerposLista) {

            System.out.println(valor.toString());
        }
    }


    // *******************************************************

    public void catalogoEspeciales() {

        this.creacionObjetos();

        for (Especiales valor: especialesLista) {

            System.out.println(valor.toString());
        }
    }

    // *******************************************************

    public void catalogoGranadas() {

        this.creacionObjetos();

        for (Granadas valor: granadasLista) {

            System.out.println(valor.toString());
        }
    }


    // *******************************************************

    public void menuTienda() {

        System.out.println("BIENVENIDO A TU TIENDA GAMING DE ARMAS FAVORITA" +
                "Escoge entre las opciones: " + "\n" +
                "1. Ver catalogo");

        int opcion = Integer.parseInt(this.sc.nextLine());

        if(opcion == 1) {

            System.out.println("Escoge cual catalogo quieres ver:" + "\n" +
                    "1. Armas de fuego" + "\n" +
                    "2. Balas" + "\n" +
                    "3. Cuerpo a Cuerpo" + "\n" +
                    "4. Especiales" + "\n" +
                    "5. Granadas");

            int opcionCatalogo = Integer.parseInt(this.sc.nextLine());

            if (opcionCatalogo == 1) {

                this.catalogoArmasFuego();
            }

            else if (opcionCatalogo == 2) {

                this.catalogoBalas();
            }

            else if (opcionCatalogo == 3) {

                this.catalogoCuerpoACuerpo();
            }

            else if (opcionCatalogo == 4) {

                this.catalogoEspeciales();
            }

            else if (opcionCatalogo == 5) {

                this.catalogoGranadas();
            }

            else {
                System.out.println("No escogiste ninguna opcion del catalogo");
            }
        }

        else {

            System.out.println("No escogiste ninguna opcion del menu");
        }
    }

}
