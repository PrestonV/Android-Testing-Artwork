package alexandria.israelferrer.com.libraryofalexandria;


import java.util.List;

public interface Model {
    void getArtWorks(Callback<List<ArtWork>> result);
}
