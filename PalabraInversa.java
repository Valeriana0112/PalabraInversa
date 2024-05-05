public class PalabraInversa {
    
private String palabra,invertir;

public String getInvertir() {
    return invertir;
}

public void setInvertir(String invertir) {
    this.invertir = invertir;
}

public String getPalabra() {
    return palabra;
}

public void setPalabra(String palabra) {
    this.palabra = palabra;
}
public String invertir() {
    String palabraInvertida = "";
    for (int i = palabra.length() - 1; i >= 0; i--) {
        palabraInvertida += palabra.charAt(i);
    }
    return palabraInvertida;
}

@Override
public String toString() {
    return "PalabraInversa [palabra=" + palabra + ", invertir=" + invertir + "]";
    
}
}

