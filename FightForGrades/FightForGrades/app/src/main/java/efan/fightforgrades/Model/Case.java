package efan.fightforgrades.Model;

public class Case {
    private int id;
    private boolean isUsable;
    private Character character;
    private String imagePath;
    private int x;
    private int y;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isUsable() {
        return isUsable;
    }

    public void setUsable(boolean usable) {
        isUsable = usable;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Case(int id, boolean isUsable, Character character, String imagePath, int x, int y) {
        this.id = id;
        this.isUsable = isUsable;
        this.character = character;
        this.imagePath = imagePath;
        this.x = x;
        this.y = y;
    }

    public Case() {
    }
}