package com.campusdual.classroom;

public class Exercise11 {

    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        System.out.println("La TV esta encendida: ");
        System.out.println(redRemote.turnOn());
        redRemote.channelUp();
        System.out.println(redRemote.channel);
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        redRemote.volumeUp();
        System.out.println(redRemote.volume);
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        System.out.println(redRemote.getColor());

        System.out.println();
        System.out.println("La TV esta apagada: ");
        TVRemote blackRemote = new TVRemote("Negro");
        blackRemote.turnOff();
        System.out.println(blackRemote.turnOff());
        System.out.println(blackRemote.getColor());
    }


}