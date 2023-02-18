public class Pokemon {
    String name;
    String type;
    int generation;

    void comparePokemon() {
        String userPokemon = "Bulbasaur";
    }
}

class Pokedex {
    public static void main(String[] args) {
        Pokemon[] pkmn = new Pokemon[6];
        pkmn[0] = new Pokemon();
        pkmn[1] = new Pokemon();
        pkmn[2] = new Pokemon();
        pkmn[3] = new Pokemon();
        pkmn[4] = new Pokemon();
        pkmn[5] = new Pokemon();

        pkmn[0].name = "Bulbasaur";
        pkmn[0].type = "Grass";
        pkmn[0].generation = 1;

        pkmn[1].name = "Charmander";
        pkmn[1].type = "Fire";
        pkmn[1].generation = 1;

        pkmn[2].name = "Squirtle";
        pkmn[2].type = "Water";
        pkmn[2].generation = 1;

        pkmn[3].name = "Chikorita";
        pkmn[3].type = "Grass";
        pkmn[3].generation = 2;

        pkmn[4].name = "Cyndaquil";
        pkmn[4].type = "Fire";
        pkmn[4].generation = 2;

        pkmn[5].name = "Totodile";
        pkmn[5].type = "Water";
        pkmn[5].generation = 2;

        String[] pokemonRandom = {pkmn[1].name,
                                    pkmn[2].name,
                                    pkmn[3].name,
                                    pkmn[4].name,
                                    pkmn[5].name};

        int pokemonRandomLength = pokemonRandom.length;

        int correctPokemon = (int) (Math.random() * pokemonRandomLength);
        String pokemonName = pokemonRandom[correctPokemon];
        System.out.println(pokemonName);
    }
}
