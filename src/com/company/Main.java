package com.company;

public class Main {

    public static void main(String[] args) {
	
       //the similarity of code referenced from this video : https://youtu.be/TErboGLHZGA
       //the song referenced from : https://youtu.be/nUHh_J2Acy8
	    
	    
        String fillepath0 = "SpaceAdventure.wav"; //Background

        String fillepath1 = "burning.wav"; //squid-Alian
        String fillepath2 = "cuttree.wav"; //crab
        String fillepath3 = "hitmonster.wav"; //Octopus
        String fillepath4 = "powerup.wav"; //Meteor
        String fillepath5 = "recievedamage .wav"; //shooter/player


// calling the song for each diff object meteor,alians or shooter

        musicthings musicPlayer1 = new musicthings();
        musicPlayer1.playMusic(fillepath0);

        //musicthings musicPlayer2 = new musicthings();
        //musicPlayer2.playMusic(fillepath2);

        // musicthings musicPlayer3 = new musicthings();
        //musicPlayer2.playMusic(fillepath2);

        // musicthings musicPlayer4 = new musicthings();
        //musicPlayer2.playMusic(fillepath3);

        // musicthings musicPlayer5 = new musicthings();
        //musicPlayer2.playMusic(fillepath4);

        // musicthings musicPlayer6 = new musicthings();
        //musicPlayer2.playMusic(fillepath5);



    }
}
