package Redditclone.Practice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private Long id;

    private String postName;

    private String url;

    private String description;

    private String userName;

    private String subredditName;

    private Integer commentCount;

    private boolean upVote;

    private boolean downVote;

    private Integer voteCount;
}
