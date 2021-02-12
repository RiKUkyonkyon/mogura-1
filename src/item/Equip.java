package item;

import character.Player;

import static constants.Constants.*;

public class Equip extends Player {

    public String name;
    public int type;
    public int damage;

    public Equip(){
        name = "装備なし";
        type = NO_EQUIP;
        damage = 0;
    }
}