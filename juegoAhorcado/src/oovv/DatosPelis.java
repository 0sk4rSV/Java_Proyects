/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class DatosPelis {

    private static String[] pelis = {"Juno", "Capitana Marvel", "Lost in translation", "Colosal",
        "Los tres mosqueteros", "Vengadores: Endgame", "El rey león", "El protegido", "La favorita",
        "Creed", "Green book", "120 pulsaciones por minuto", "Caras y lugares", "Vengadores: Infinity War",
        "Casi 40", "The Florida Project", "Con amor, Simon", "Hereditary", "Amante por un día", "La cámara de Claire",
        "Disobedience", "Lean on Pete", "Tres anuncios en las afueras", "Tully", "El hilo invisible",
        "Misión Imposible: Fallout", "Un lugar tranquilo", "Lady Bird", "Noche de juegos", "Campeones",
        "El taller de escritura", "Jurassic World 2: El reino caído", "Lucky", "Isla de perros", "Un sol interior",
        "Custodia compartida", "Call me by your name", "Thelma", "Spider-Man: Un nuevo universo",
        "La forma del agua", "Black Panther", "Roma", "Airforce one", "A Todo Gas 7", "Amor y amistad", "Anomalisa",
        "Ahora sí, antes no", "Aniquilación", "Animales Fantásticos: Los crímenes de Grindelwald",
        "Bone Tomahawk", "Breve encuentro", "Blade Runner 2049", "Black Panther",
        "Carol", "Capitán América: Civil war", "Calle Cloverfield 10", "Centauros del desierto",
        "Carta de una desconocida", "Corazón gigante", "Cars 3", "Cenicienta", "Call Me by Your Name",
        "Cleopatra", "C'est la vie!", "Cincuenta sombras de Grey", "Cincuenta sombras más oscuras",
        "Cincuenta sombras liberadas", "Deadpool", "Dos buenos tipos", "Doctor Strange",
        "Dos Policias Rebeldes 3", "Dunkerque", "E.T.", "El hijo de Saúl", "El cuento de la princesa Kaguya",
        "Esa sensación", "El hombre de las mil caras", "El porvenir", "Elle", "Expediente Warren: El caso Enfield",
        "El gran Lebowski", "El principito", "El renacido", "El porvenir", "El hilo invisible",
        "Experimenter: La historia de Stanley Milgram", "El instante más oscuro", "Entre ellas", "El extranjero",
        "El joven Karl Marx", "El mar nos mira de lejos", "El Libro de la Selva", "El corredor del laberinto: La cura mortal",
        "El gorrión rojo", "El pasajero", "Fast and Furious 8", "Green room", "Guardianes de la galaxia",
        "Guerra Mundial Z", "Guerra por el Planeta de los Simios", "Ghost in the Shell", "Gru: mi villano favorito 3",
        "Historia de una pasión", "High-Rise", "Insidious: La última llave", "Julieta", "Juno", "Kubo y las dos cuerdas mágicas",
        "Kiki, el amor se hace", "Los odiosos ocho", "La juventud", "La habitación", "La bruja", "La reconquista",
        "La fiesta de las salchichas", "La próxima piel", "La llegada", "La novia cadáver", "Los mundos de Caroline",
        "Los Boxtrolls", "La rebelión de los cuentos", "LEGO Batman: La película", "La doncella", "Los Minions",
        "La Torre Oscura", "La Bella y la Bestia", "La Liga de la Justicia", "Loving Vincent",
        "Los archivos del Pentágono", "La Momia", "Loving Pablo", "La muerte de Stalin", "Las heridas del viento",
        "Los Increíbles 2", "La ciudad de las estrellas", "La Bella y la Bestia", "Mustang", "Molly's Game",
        "María Magdalena", "Mazinger Z Infinity", "Maléfica", "Pelham 1 2 3", "Puro vicio", "Paterson",
        "Plan de chicas", "Petzi y la mar salada", "Piratas del Caribe 5: La Venganza de Salazar",
        "Pacific Rim: Insurrección", "Que Dios nos perdone", "Que baje Dios y lo vea", "Resident Evil: El Capítulo Final",
        "Red", "Ready Player One", "Spotlight", "Sólo el cielo lo sabe", "Star Trek: Más allá", "Sin amor",
        "Salvando al Reino de Oz", "Sola en casa", "Star Wars: el Despertar de la Fuerza", "Star Wars: Los últimos Jedi",
        "Todos queremos algo", "Tarde para la ira", "The Neon Demon", "Toro", "Tomb Raider",
        "Transformers: El Último Caballero", "Thor: Ragnarok", "Tres anuncios en las afueras",
        "The Florida Project", "Todo el dinero del mundo", "Thi Mai, rumbo a Vietnam", "The Belko Experiment",
        "Un monstruo viene a verme", "Up", "Vengadores: Infinity War", "Wonderstruck. El museo de las maravillas",
        "Wonder Woman", "Yo, Tonya", "Zootrópolis", "Zama", "15:17 Tren a París"
    };

    public static List<String> getPelis() {
        
        String cad = "níñò:2";
        char car = cad.charAt(3);
        System.out.println(car);
        if(Character.isAlphabetic(car)){
            System.out.println(car);
        }
        
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < pelis.length; i++) {
            lista.add(pelis[i]);
        }
        return lista;
    }

}
