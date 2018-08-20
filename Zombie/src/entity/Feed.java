package entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="feedz")
@SequenceGenerator(name="sf",sequenceName="seq_feed")
public class Feed {
	@Id
	@GeneratedValue(generator="sf")
	@Column(name="feedId")
	private int feedId;
	
	private String query;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date feedTime;
	
	@OneToMany(mappedBy="feed",cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Set<Comment> comments;
	
	@Formula("(select count(*) from commentz c where c.feedId=feedId)")
	private int totalCmnts;
	
	public Date getFeedTime() {
		return feedTime;
	}
	public void setFeedTime(Date feedTime) {
		this.feedTime = feedTime;
	}
	public int getTotalCmnts() {
		return totalCmnts;
	}
	public void setTotalCmnts(int totalCmnts) {
		this.totalCmnts = totalCmnts;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getfeedTime() {
		return feedTime;
	}
	public void setfeedTime(Date feedTime) {
		this.feedTime = feedTime;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	

}
