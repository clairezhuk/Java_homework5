package com.company;

public class WarriorAcademy{
    void teach(Trainee trainee){
        if (trainee instanceof Warrior){trainee.train();}
    }
}
