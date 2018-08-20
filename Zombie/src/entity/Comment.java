package entity;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="commentz")
@SequenceGenerator(name="sc",sequenceName="seq_cmnt")
public class Comment {
	@Id
	@GeneratedValue(generator="sc")
	@Column(name="commentId")
	private int commentId;
	
	private String response;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date commentTime;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="feedId")
	private Feed feed;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	
	public Date getcommentTime() {
		return commentTime;
	}
	public void setcommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Feed getFeed() {
		return feed;
	}
	public void setFeed(Feed feed) {
		this.feed = feed;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
}
