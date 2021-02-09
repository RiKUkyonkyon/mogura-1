package character;

public class Character {
    String name = "名前なし";
    int hp = 100;
    int attack = 20;
    int defence = 10;
    public int mAttack = 0;
    public int mDefence = 0;
    public int speed = 0;

    //アクセス制限
    // ＝＝＝＝＝＝＝＝名前
    public String getName (){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    // ＝＝＝＝＝＝＝＝HP
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp(){
        return this.hp;
    }

    // ＝＝＝＝＝＝＝＝防御力
    public void setDefence(int defence) {
        this.defence = defence;
    }
    public int getDefence(){
        return this.defence;
    }

    // ＝＝＝＝＝＝＝＝攻撃力
    public void setAttck(int attack) {
        this.attack = attack;
    }
    public int getAttack(){
        return this.attack;
    }
}