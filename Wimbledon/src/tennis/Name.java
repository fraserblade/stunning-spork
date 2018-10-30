/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Chris
 */
public class Name {

    static String generate() {

        Dice d1 = new Dice(firstNames.size());
        Dice d2 = new Dice(secondNames.size());

        return firstNames.get(d1.roll() - 1) + " " + secondNames.get(d2.roll() - 1);

    }

    static List<String> firstNames = Arrays.asList("Jed", "Alistair", "Johnathan", "Pascal", "Simon", "Chris", "Rafael", "Deitmar", "Pablo", "Rich", "Randy", "Steve", "Doug", "Lucas", "Dave", "Gareth", "Fred", "Ian", "Ken", "Kevin", "Alan", "Tim", "Roger", "James", "Eddie", "Leon", "Leo", "John", "Ethan", "Aiden", "Oscar", "Alex", "Paul", "Chris", "Oliver");

    static String generateTournamentName() {

        Dice d1 = new Dice(firstTNames.size());
        Dice d2 = new Dice(secondTNames.size());

        return firstTNames.get(d1.roll() - 1) + " " + secondTNames.get(d2.roll() - 1);

    }

    static List<String> firstTNames = Arrays.asList("The British", "Flushing", "Paris", "Sydney", "The American", "The European");
    static List<String> secondTNames = Arrays.asList("Meadows", "Open", "Grand Slam", "Market", "Masters", "Indoor", "Championship");

    static List<String> secondNames = Arrays.asList(
            "Smith",
            "Randall",
            "Truman",
            "Hay",
            "Bingley",
            "Davies",
            "Walton",
            "Shah",
            "Connors",
            "Brown",
            "Williams",
            "Koala",
            "Peters",
            "Murray",
            "Pearson",
            "Samson",
            "Jeremies",
            "McEnroe",
            "Edwards",
            "Rogerson",
            "Rae",
            "Taylor",
            "Williams",
            "Brown",
            "Davies",
            "Evans",
            "Wilson",
            "Thomas",
            "Roberts",
            "Johnson",
            "Lewis",
            "Walker",
            "Robinson",
            "Wood",
            "Thompson",
            "White",
            "Watson",
            "Jackson",
            "Wright",
            "Green",
            "Harris",
            "Cooper",
            "King",
            "Lee",
            "Martin",
            "Clarke",
            "James",
            "Morgan",
            "Hughes",
            "Edwards",
            "Hill",
            "Moore",
            "Clark",
            "Harrison",
            "Scott",
            "Young",
            "Morris",
            "Hall",
            "Ward",
            "Turner",
            "Carter",
            "Phillips",
            "Mitchell",
            "Patel",
            "Adams",
            "Campbell",
            "Anderson",
            "Allen",
            "Cook",
            "Bailey",
            "Parker",
            "Miller",
            "Davis",
            "Murphy",
            "Price",
            "Bell",
            "Baker",
            "Griffiths",
            "Kelly",
            "Simpson",
            "Marshall",
            "Collins",
            "Bennett",
            "Cox",
            "Richardson",
            "Fox",
            "Gray",
            "Rose",
            "Chapman",
            "Hunt",
            "Robertson",
            "Shaw",
            "Reynolds",
            "Lloyd",
            "Ellis",
            "Richards",
            "Russell",
            "Wilkinson",
            "Khan",
            "Graham",
            "Stewart",
            "Reid",
            "Murray",
            "Powell",
            "Palmer",
            "Holmes",
            "Rogers",
            "Stevens",
            "Walsh",
            "Hunter",
            "Thomson",
            "Matthews",
            "Ross",
            "Owen",
            "Mason",
            "Knight",
            "Kennedy",
            "Butler",
            "Saunders",
            "Cole",
            "Pearce",
            "Dean",
            "Foster",
            "Harvey",
            "Hudson",
            "Gibson",
            "Mills",
            "Berry",
            "Barnes",
            "Pearson",
            "Kaur",
            "Booth",
            "Dixon",
            "Grant",
            "Gordon",
            "Lane",
            "Harper",
            "Ali",
            "Hart",
            "Mcdonald",
            "Brooks",
            "Ryan",
            "Carr",
            "Macdonald",
            "Hamilton",
            "Johnston",
            "West",
            "Gill",
            "Dawson",
            "Armstrong",
            "Gardner",
            "Stone",
            "Andrews",
            "Williamson",
            "Barker",
            "George",
            "Fisher",
            "Cunningham",
            "Watts",
            "Webb",
            "Lawrence",
            "Bradley",
            "Jenkins",
            "Wells",
            "Chambers",
            "Spencer",
            "Poole",
            "Atkinson",
            "Lawson");

}
