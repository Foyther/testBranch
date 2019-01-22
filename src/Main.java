public class Main {

    public static void main(String[] args) {
		Event event  = new Event();
		event.setEvent("new game");
		event.setEvent("new game2");
		event.setEvent("uzhe old game");
		event.setEvent("uzhe old game 2");
        System.out.println("Hello, " + event.getEvent() + "main branch");
    }
}
