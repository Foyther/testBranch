public class Main {

    public static void main(String[] args) {
		Event event  = new Event();
		event.setEvent("im a new event");
		event.setEvent("im a pirat, hahahah");
		event.setEvent("no, here im a main branch");
		event.setEvent("shut up and dance with me");
        System.out.println("Hello, " + event.getEvent() + "main branch");
    }
}
