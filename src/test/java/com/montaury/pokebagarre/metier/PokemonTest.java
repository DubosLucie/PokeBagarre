package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void premier_vainqueur_meilleure_attaque() {
        // GIVEN
        Stats statsPremier = new Stats(100, 50); // Attaque: 100, Défense: 50
        Stats statsSecond = new Stats(80, 60);  // Attaque: 80, Défense: 60

        Pokemon premierPokemon = new Pokemon("Premier", "url1", statsPremier);
        Pokemon secondPokemon = new Pokemon("Second", "url2", statsSecond);

        // WHEN
        boolean premierVainqueur = premierPokemon.estVainqueurContre(secondPokemon);

        // THEN
        assertEquals(true, premierVainqueur);
    }

    @Test
    void deuxieme_vainqueur_meilleure_attaque() {
        // GIVEN
        Stats statsPremier = new Stats(80, 50); // Attaque: 80, Défense: 50
        Stats statsSecond = new Stats(100, 60);  // Attaque: 100, Défense: 60

        Pokemon premierPokemon = new Pokemon("Premier", "url1", statsPremier);
        Pokemon secondPokemon = new Pokemon("Second", "url2", statsSecond);

        // WHEN
        boolean secondVainqueur = secondPokemon.estVainqueurContre(premierPokemon);

        // THEN
        assertEquals(true, secondVainqueur);
    }

    @Test
    void premier_vainqueur_attaque_egale_mailleure_defense() {
        // GIVEN
        Stats statsPremier = new Stats(100, 60); // Attaque: 100, Défense: 60
        Stats statsSecond = new Stats(100, 50);  // Attaque: 100, Défense: 50

        Pokemon premierPokemon = new Pokemon("Premier", "url1", statsPremier);
        Pokemon secondPokemon = new Pokemon("Second", "url2", statsSecond);

        // WHEN
        boolean premierVainqueur = premierPokemon.estVainqueurContre(secondPokemon);

        // THEN
        assertEquals(true, premierVainqueur);

    }

    @Test
    void deuxieme_vainqueur_attaque_egale_mailleure_defense() {
        // GIVEN
        Stats statsPremier = new Stats(100, 50); // Attaque: 100, Défense: 50
        Stats statsSecond = new Stats(100, 60);  // Attaque: 100, Défense: 60

        Pokemon premierPokemon = new Pokemon("Premier", "url1", statsPremier);
        Pokemon secondPokemon = new Pokemon("Second", "url2", statsSecond);

        // WHEN
        boolean secondVainqueur = secondPokemon.estVainqueurContre(premierPokemon);

        // THEN
        assertEquals(true, secondVainqueur);
    }

    @Test
    void premier_vainqueur_attaque_egale_defense_egale() {
        // GIVEN
        Stats statsPremier = new Stats(100, 50); // Attaque: 100, Défense: 50
        Stats statsSecond = new Stats(80, 50);  // Attaque: 80, Défense: 50

        Pokemon premierPokemon = new Pokemon("Premier", "url1", statsPremier);
        Pokemon secondPokemon = new Pokemon("Second", "url2", statsSecond);

        // WHEN
        boolean premierVainqueur = premierPokemon.estVainqueurContre(secondPokemon);

        // THEN
        assertEquals(true, premierVainqueur);

    }

}