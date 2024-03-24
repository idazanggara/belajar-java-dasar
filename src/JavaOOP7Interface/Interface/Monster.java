package JavaOOP7Interface.Interface;

public class Monster {
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
//    public void attack(Monster monster) {
//        monster.receivedDamage(this.damage);
//    }

//    public void attack(Hero hero) {
//        hero.receivedDamage(this.damage);
//

    // diganti
    public void attack(HitAble hitAble) {
        hitAble.receivedDamage(this.damage);
    }

    public void receivedDamage(Integer damage) {
        this.hp -= damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
