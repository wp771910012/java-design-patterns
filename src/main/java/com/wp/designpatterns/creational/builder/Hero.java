package com.wp.designpatterns.creational.builder;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/21 9:27
 */
public class Hero {
    private final String profession;
    private final String name;
    private final String hairType;
    private final String hairColor;
    private final String armor;
    private final String weapon;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", hairType='" + hairType + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", armor='" + armor + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public static class Builder {
        private final String profession;
        private final String name;
        private String hairType;
        private String hairColor;
        private String armor;
        private String weapon;

        public Builder(String profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(String hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }

    public static void main(String[] args) {
        Hero hero = new Builder("swordsman","qqq").withHairColor("black").withWeapon("sword").build();
        Hero hero1 = new Builder("archer","www").withWeapon("crossbow").build();

        System.out.println(hero.toString());
        System.out.println(hero1.toString());
    }

}
