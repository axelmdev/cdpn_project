package efan.fightforgrades.Model;

import java.util.List;

public class ActiveCharacter extends Character {
    private int level;
    private int life;
    private int baseLife;
    private int attack;
    private int baseAttack;
    private int defense;
    private int baseDefense;
    private List<Skill> skills;
    private int currentExperience;
    private int experienceToNextLevel;
}