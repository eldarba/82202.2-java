package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Message {
	
//	@Autowired // field injection [2]
	private String content;
	
	public Message() {
	}

	@Autowired // ctor injection [1]
	public Message(String content) {
		super();
		this.content = content;
	}
	
	public Message(String content, int x) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

//	@Autowired // setter injection [3]
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Message [content=" + content + "]";
	}
	
	

}
