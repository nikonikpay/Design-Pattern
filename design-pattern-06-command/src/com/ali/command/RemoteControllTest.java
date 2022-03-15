//package com.ali.command;
//
//public class RemoteControllTest {
//    public static void main(String[] args) {
//        SimpleRemoteControll remoteControll = new SimpleRemoteControll();
//        Light light = new Light();
//        LightOnCommand lightOn = new LightOnCommand(light);
//
//        GarageDoor garageDoor = new GarageDoor();
//        GarageDoorOpenCommand garageCommand = new GarageDoorOpenCommand(garageDoor);
//
//
//        remoteControll.setCommand(lightOn);
//        remoteControll.buttonWasPressed();
//
//        remoteControll.setCommand(garageCommand);
//        remoteControll.buttonWasPressed();
//
//    }
//}
