package com.company;

public class PriestAcademy {
    void teach(Trainee trainee){
        if (trainee instanceof Healer){trainee.train();}
    }
}
