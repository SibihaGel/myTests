package org.example;

public class OopApplication {

    static String heroName;
    static int heroHp;
    static int heroAtack;

    static String monsterName;
    static int monsterHp;
    static int monsterAtack;

    public static void main(String[] args) {

        heroName = "Jack";
        heroAtack = 2;
        heroHp = 100;

        monsterName = "Goblin";
        monsterAtack = 3;
        monsterHp = 50;

    }

    public static void MonsterAtack() {
        heroHp -= monsterAtack;
    }

    public static void HeroAtack() {
        monsterHp -= heroAtack;
    }
}
