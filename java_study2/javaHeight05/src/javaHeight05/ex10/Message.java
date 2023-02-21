package javaHeight05.ex10;

public class Message {
    private String command;
    private String to;
    
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
    
    
}
