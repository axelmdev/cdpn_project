package efan.fightforgrades.Model;

import java.util.List;

public class Character {
    private int id;
    private String name;
    private List<Sentence> allSentences;

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

    public List<Sentence> getAllSentences() {
        return allSentences;
    }

    public void setAllSentences(List<Sentence> allSentences) {
        this.allSentences = allSentences;
    }

    public void Speak(Sentence sentence)
    {
        System.out.println(sentence.getContent());
    }
}