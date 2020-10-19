package com.bcGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlShould {

    @Test
    void openClosedDoor() {
        DogDoor dogDoor = new DogDoor();
        RemoteControl remoteControl = new RemoteControl(dogDoor);

        //set initial state of doors to "closed"
        dogDoor.setOpen(false);
        //use the remote control to change the status
        remoteControl.pressButton();
        //check the doors are really "open"
        assertTrue(dogDoor.isOpen());
    }

    @Test
    void closeOpenedDoor() {
        DogDoor dogDoor = new DogDoor();
        RemoteControl remoteControl = new RemoteControl(dogDoor);

        //set initial state of doors to "open"
        dogDoor.setOpen(true);
        //use the remote control to change the status
        remoteControl.pressButton();
        //check the doors are really "closed"
        assertFalse(dogDoor.isOpen());
    }
}