package efan.fightforgrades.Model;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int id;
    private String name;
    private List<Case> cases;
    private List<ActiveCharacter> ennemies;
    private ActiveCharacter boss;
    private List<Character> ally;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

    public List<ActiveCharacter> getEnnemies() {
        return ennemies;
    }

    public void setEnnemies(List<ActiveCharacter> ennemies) {
        this.ennemies = ennemies;
    }

    public ActiveCharacter getBoss() {
        return boss;
    }

    public void setBoss(ActiveCharacter boss) {
        this.boss = boss;
    }

    public List<Character> getAlly() {
        return ally;
    }

    public void setAlly(List<Character> ally) {
        this.ally = ally;
    }

    public void ChangeMap()
    {

    }

    public Map() {
        cases = new ArrayList<Case>();
    }
}

