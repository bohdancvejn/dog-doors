package com.bcGame;

public class RemoteControl {

    private DogDoor dogDoor;

    public RemoteControl(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressButton() {
        if (dogDoor.isOpen()) {
            dogDoor.setOpen(false);
        } else {
            dogDoor.setOpen(true);
        }
    }
}
