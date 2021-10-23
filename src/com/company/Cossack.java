package com.company;

public class Cossack extends Warrior{
    public Cossack(int level, int leavePoints, int fisicalDamage, int multiplicleFisicalDamage){
        super(level,leavePoints,fisicalDamage,multiplicleFisicalDamage);
    }
    Saber saber = new Saber();
    void chopWithSaber(){}
    @Override
    void infoAboutHero(){
        System.out.println("type: cossack");
        System.out.println("level: "+level);
        System.out.println("leave points: "+leavePoints);
        System.out.println("fisical damage: "+fisicalDamage);
        if (saber.name != null) {System.out.println("saber: "+saber.name);}
    }
}
