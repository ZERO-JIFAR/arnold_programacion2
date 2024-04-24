package ejercicio_equipo_16_4;
public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Mesi", "Delantero", 3),
                new Player("Maradona", "Defensor", 9),
                new Player("Carlos", "Arquero", 1)};
        Player equipo1 = new Player(players);
        for(Player player: players){
            player.see();
        }
    }
}