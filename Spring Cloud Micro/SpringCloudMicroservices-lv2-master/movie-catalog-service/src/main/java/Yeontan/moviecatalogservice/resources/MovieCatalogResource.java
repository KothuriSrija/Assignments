package Yeontan.moviecatalogservice.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import Yeontan.moviecatalogservice.Models.CatalogItem;
import Yeontan.moviecatalogservice.Models.UserRating;
import Yeontan.moviecatalogservice.services.MovieInfo;
import Yeontan.moviecatalogservice.services.UserRatingInfo;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    MovieInfo Movieinfo;

    @Autowired
    UserRatingInfo UserRatingInfo ;

    @RequestMapping("/{userid}")
    public List<CatalogItem> getCatalog(@PathVariable("userid") String userId) {
        UserRating ratings = UserRatingInfo.getUserRating(userId);
        return ratings.
                getUserRating().
                stream().
                map(rating -> Movieinfo.getCatalogItem(rating))
                .collect(Collectors.toList());
    }

}

