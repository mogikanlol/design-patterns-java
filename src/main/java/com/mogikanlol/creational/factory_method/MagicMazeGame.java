package com.mogikanlol.creational.factory_method;

import com.mogikanlol.creational.factory_method.room.MagicRoom;
import com.mogikanlol.creational.factory_method.room.Room;

public class MagicMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
