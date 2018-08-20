package service;

import java.util.List;

import bean.CommentBean;
import entity.Comment;
import entity.Feed;

public interface FeedService {
	void askQuestion(Feed feed);

	List<Feed> getMyFeeds(String userId);

	List<Feed> searchFeeds(String keyword);

	Feed getQuestion(int fid);

	Feed submitComment(Comment comment);

}
