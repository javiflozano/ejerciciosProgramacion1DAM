package com.iessanalberto.dam1.proteccioncivil.data;

public class Distancias {
    public static int calcularDistancia(String origen, String destino) {
        switch (origen){
            case "Candanchú" -> {
                switch (destino){
                    case "Valle de Tena" -> {return  50;}
                    case "Valle de Aragón" -> {return  10;}
                    case "Valle de Arán" -> {return  80;}
                    case "Valle de Ordesa" -> {return  70;}
                    case "Valle de Ansó" -> {return  20;}
                    case "Valle de Benasque" -> {return  40;}
                }
            }
            case "Jaca" ->{
                switch (destino){
                    case "Valle de Tena" -> {return  30;}
                    case "Valle de Aragón" -> {return  15;}
                    case "Valle de Arán" -> {return  50;}
                    case "Valle de Ordesa" -> {return  40;}
                    case "Valle de Ansó" -> {return  20;}
                    case "Valle de Benasque" -> {return  70;}
                }
            }
            case "Boltaña" ->{
                switch (destino){
                    case "Valle de Tena" -> {return  40;}
                    case "Valle de Aragón" -> {return  55;}
                    case "Valle de Arán" -> {return  35;}
                    case "Valle de Ordesa" -> {return  10;}
                    case "Valle de Ansó" -> {return  60;}
                    case "Valle de Benasque" -> {return  40;}
                }
            }
            case "Benasque" ->{
                switch (destino){
                    case "Valle de Tena" -> {return  40;}
                    case "Valle de Aragón" -> {return  75;}
                    case "Valle de Arán" -> {return  20;}
                    case "Valle de Ordesa" -> {return  30;}
                    case "Valle de Ansó" -> {return  80;}
                    case "Valle de Benasque" -> {return  5;}
                }
            }
            case "Biescas" ->{
                switch (destino){
                    case "Valle de Tena" -> {return  10;}
                    case "Valle de Aragón" -> {return  25;}
                    case "Valle de Arán" -> {return  60;}
                    case "Valle de Ordesa" -> {return  40;}
                    case "Valle de Ansó" -> {return  35;}
                    case "Valle de Benasque" -> {return  70;}
                }
            }
            case "Pont de Suert" ->{
                switch (destino){
                    case "Valle de Tena" -> {return  60;}
                    case "Valle de Aragón" -> {return  75;}
                    case "Valle de Arán" -> {return  10;}
                    case "Valle de Ordesa" -> {return  30;}
                    case "Valle de Ansó" -> {return  90;}
                    case "Valle de Benasque" -> {return  30;}
                }
            }
        }
        return -1;

    }
}
