package com.mogikanlol.creational.factory_method;

import com.mogikanlol.creational.factory_method.room.OrdinaryRoom;
import com.mogikanlol.creational.factory_method.room.Room;

public class OrdinaryMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}
