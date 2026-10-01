import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> horas = new HashMap<>();
        Map<String, Integer> turnos = new HashMap<>();
        horas.put("Ana", 20); horas.put("Bruno", 15); horas.put("Carla", 25);
        turnos.put("Ana", 2); turnos.put("Bruno", 1); turnos.put("Carla", 3);
        for (String nome : horas.keySet()) {
            int h = horas.get(nome);
            int t = turnos.get(nome);
            if (t >= 3) {
                System.out.println(nome + ": Folga obrigatória (" + t + " turnos seguidos)");
            } else if (h + 15 > 40) {
                System.out.println(nome + ": Excedeu limite de horas (" + (h + 15) + "h)");
            } else {
                System.out.println(nome + ": Alocada (" + (t + 1) + " turnos seguidos, " + (h + 15) + "h)");
            }
        }
    }
}