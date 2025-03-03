package supernova.whokie.friend.infrastructure.apiCaller.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

public class KakaoDto {


    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public record Friends(
        String afterUrl,
        List<Profile> elements
    ) {

    }

    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public record Profile(
            Long id,
            String uuid,
            Boolean favorite,
            String profileNickname,
            String profileThumbnailImage
    ) {

    }
}
