package chatbotProject;

public class Chatbot {

	private String userName;
	private Topic carson;
	private boolean chatting;
	
	public Chatbot() {
		carson = new ChatbotCarson();
		userName = "unknown user";
		chatting = true;
	}
	
	public void startTalking() {
		ChatbotMain.print("Welcome to our chatbot! What is your name?");
		userName = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What do you want to talk about?");
			String response = ChatbotMain.getInput();
			if(carson.isTriggered(response)) {
				chatting = false;
				carson.startChatting();
			}else {
				ChatbotMain.print("Im sorry I don't understand.");
						+ 
			}
		}
	}

}
