package org.academiadecodigo.bootcamp.MapEditor;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboard implements KeyboardHandler {

    private Keyboard keyboard;
    private MapEditor mapEditor;

    public MyKeyboard(MapEditor mapEditor) {

        this.mapEditor = mapEditor;
        keyboardInit();

    }

    public void keyboardInit() {

        keyboard = new Keyboard(this);

        KeyboardEvent upPress = new KeyboardEvent();
        upPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        upPress.setKey(KeyboardEvent.KEY_UP);

        keyboard.addEventListener(upPress);

        KeyboardEvent downPress = new KeyboardEvent();
        downPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        downPress.setKey(KeyboardEvent.KEY_DOWN);

        keyboard.addEventListener(downPress);

        KeyboardEvent leftPress = new KeyboardEvent();
        leftPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        leftPress.setKey(KeyboardEvent.KEY_LEFT);

        keyboard.addEventListener(leftPress);

        KeyboardEvent rightPress = new KeyboardEvent();
        rightPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        rightPress.setKey(KeyboardEvent.KEY_RIGHT);

        keyboard.addEventListener(rightPress);

        KeyboardEvent spacePress = new KeyboardEvent();
        spacePress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        spacePress.setKey(KeyboardEvent.KEY_SPACE);

        keyboard.addEventListener(spacePress);

        KeyboardEvent sPress = new KeyboardEvent();
        sPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        sPress.setKey(KeyboardEvent.KEY_S);

        keyboard.addEventListener(sPress);

        KeyboardEvent lPress = new KeyboardEvent();
        lPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        lPress.setKey(KeyboardEvent.KEY_L);

        keyboard.addEventListener(lPress);

        KeyboardEvent pPress = new KeyboardEvent();
        pPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pPress.setKey(KeyboardEvent.KEY_P);

        keyboard.addEventListener(pPress);

    }

    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:
                mapEditor.move(Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                mapEditor.move(Direction.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                mapEditor.move(Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                mapEditor.move(Direction.RIGHT);
                break;
            case KeyboardEvent.KEY_SPACE:
                mapEditor.paint();
                break;
            case KeyboardEvent.KEY_S:
                mapEditor.save();
                break;
            case KeyboardEvent.KEY_L:
                mapEditor.load();
                break;
            case KeyboardEvent.KEY_P:
                mapEditor.printCells();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
