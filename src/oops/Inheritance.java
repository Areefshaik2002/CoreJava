package oops;
//Single inheritance - it contains only one super-class and one sub-class.
class TextMessage {
	public void message() {
		System.out.println("text message");
	}
}
class EmojiMessages extends TextMessage{
	public void emojimessages() {
		System.out.println("emojiMesages");
	}
}
public class Inheritance{
public static void main(String[] args) {
	EmojiMessages obj1 = new EmojiMessages();
	obj1.emojimessages();
	obj1.message();
	}

}
//we create objects to only non-static methods
