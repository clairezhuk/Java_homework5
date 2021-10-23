package com.company;

public class Druid extends Healer{
    Animal animal = new Animal();
    public Druid(int level, int leavePoints, int fisicalDamage, int healPower){
        super(level,leavePoints,fisicalDamage,healPower);
    }
    void tameAnimal(Animal animal){
        this.animal = animal;
    }
    @Override
    void infoAboutHero(){
        System.out.println("type: druid");
        System.out.println("level: "+level);
        System.out.println("leave points: "+leavePoints);
        System.out.println("fisical damage: "+fisicalDamage);
        System.out.println("heal power: "+healPower);
        if (animal.name != null) {System.out.println("animal:"+animal.name);}
    }
}
