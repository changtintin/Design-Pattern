package Ch6.Java.CommandPattern;

import Ch6.Java.Command.*;
import Ch6.Java.Invoker.*;
import Ch6.Java.Receiver.*;


public class CommandPattern {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Light livingroomLight = new Light("living room");
        Light studioLight = new Light("Music Studio");

        Curtain bedroomCurtain = new Curtain("bedroom");
        Curtain livingroomCurtain = new Curtain("Livingroom");
        Fridge kitchenFridge = new Fridge("kitchen");

        CurtainOpenCommand livingroomCurtainOpen = new CurtainOpenCommand(livingroomCurtain);
        CurtainCloseCommand livingroomCurtainClose = new CurtainCloseCommand(livingroomCurtain);

        CurtainOpenCommand bedroomCurtainOpen = new CurtainOpenCommand(bedroomCurtain);
        CurtainCloseCommand bedroomCurtainClose = new CurtainCloseCommand(bedroomCurtain);

        LightOnCommand livingroomLightOnCommand = new LightOnCommand(livingroomLight);
        LightOffCommand livingroomLightOffCommand = new LightOffCommand(livingroomLight);

        LightOnCommand studioLightOnCommand = new LightOnCommand(studioLight);
        LightOffCommand studioLightOffCommand = new LightOffCommand(studioLight);

        FridgeOpenCommand kitchenFridgeOpenCommand = new FridgeOpenCommand(kitchenFridge);
        FridgeCloseCommand kitchenFridgeOffCommand = new FridgeCloseCommand(kitchenFridge);

        System.out.println(remote);

        remote.setCommand(1, livingroomCurtainOpen, livingroomCurtainClose);
        remote.setCommand(2, livingroomLightOnCommand, livingroomLightOffCommand);
        remote.setCommand(3, kitchenFridgeOpenCommand, kitchenFridgeOffCommand);
        remote.setCommand(4, bedroomCurtainOpen, bedroomCurtainClose);
        remote.setCommand(5, studioLightOnCommand, studioLightOffCommand);

        System.out.println(remote);

        remote.pressOffBtn(4);
        remote.pressOnBtn(5);       
        remote.pressUndoBtn();
        remote.pressOnBtn(5);
        remote.pressOnBtn(1);
        remote.pressOffBtn(7);
    }
}
