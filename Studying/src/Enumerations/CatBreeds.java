package Enumerations;

public enum CatBreeds {

    BRITISH_SHORTHAIR(1), PERSIAN(2), MAINE_COON(3), AMERICAN_SHORTHAIR(4), SPHYNX(5);

    private int breed_id;

    CatBreeds(int id){
        breed_id = id;
    }

}
