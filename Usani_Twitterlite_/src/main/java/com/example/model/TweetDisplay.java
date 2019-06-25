package com.example.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {
    private User user;
	
    private String message;
	
	private String date;
	
    private List<Tag> tags;

	public void setMessage1(CharSequence message2) {
		// TODO Auto-generated method stub
		
	}

	public void setUser(Object user2) {
		// TODO Auto-generated method stub
		
	}

	public void setMessage(CharSequence message2) {
		// TODO Auto-generated method stub
		
	}

	public void setTags(Object tags2) {
		// TODO Auto-generated method stub
		
	}

	public void setDate(String format) {
		// TODO Auto-generated method stub
		
	}
}
