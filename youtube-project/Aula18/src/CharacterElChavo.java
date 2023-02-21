public class CharacterElChavo {
    String characterName;
    String actorName;
    boolean starring;

    void episode() {
        if (this.starring) {
            System.out.println(this.actorName + " está atuando nesse episódio como " + this.characterName + ".");
        } else {
            System.out.println(this.actorName + " não está atuando nesse episódio como " + this.characterName + ".");
        }
    }
}

class VecindadDelChavo {
    public static void main(String[] args) {
        CharacterElChavo[] character = new CharacterElChavo[8];

        int x;
        x = 0;

        while (x < 7) {
            x = x + 1;
            character[x] = new CharacterElChavo();
            character[x].characterName = "Chaves";
            character[x].actorName = "Roberto Gomez Bolanos";
            character[x].starring = true;

            if (x == 2) {
                character[x].characterName = "Seu Madruga";
                character[x].actorName = "Ramon Valdes";
                character[x].starring = true;
            }
            if (x == 3) {
                character[x].characterName = "Quico";
                character[x].actorName = "Carlos Villagran";
                character[x].starring = false;
            }
            if (x == 4) {
                character[x].characterName = "Chiquinha";
                character[x].actorName = "Maria Antonieta de las Nieves";
                character[x].starring = true;
            }
            if (x == 5) {
                character[x].characterName = "Senhor Barriga";
                character[x].actorName = "Edgar Vivar";
                character[x].starring = true;
            }
            if (x == 6) {
                character[x].characterName = "Dona Florinda";
                character[x].actorName = "Florinda Meza";
                character[x].starring = false;
            }
            if (x == 7) {
                character[x].characterName = "Professor Girafales";
                character[x].actorName = "Ruben Aguirre";
                character[x].starring = false;
            }
            character[x].episode();
        }
        System.out.println("\n");
        System.out.println("Alguns atores estão participando e outros não.");
    }
}
