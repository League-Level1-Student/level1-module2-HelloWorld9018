package _99_extra;

public class Key {
String roomName;
	 Key(String roomName){
		 this.roomName = roomName;
	 }
	 
	 public static void main(String[] args) {
		Key lock = new Key("Dungeon of Doom");
		Door room1 = new Door ("Dungeon of Doom");
		Door room2 = new Door("Torture Room");
		
		System.out.println(room1.openDoor(lock));
		System.out.println(room2.openDoor(lock));
	}
	 
}

class Door {
	String roomName;
	Door(String roomname){
		this.roomName = roomname;
		
	}
    boolean openDoor(Key key) {
    	if(key.roomName .equals(roomName) ) {
    		return true;
    	}
		return false;}
}
