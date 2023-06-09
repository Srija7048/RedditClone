package Redditclone.Practice.Repository;

import Redditclone.Practice.Model.Post;
import Redditclone.Practice.Model.Subreddit;
import Redditclone.Practice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
