package twodo.twodo.dto.api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import twodo.twodo.dto.model.ECategory;
import twodo.twodo.dto.model.EUser;

public interface ApiService {

    @FormUrlEncoded
    @POST("user/login")
    Call<EUser> login(@Field("email") String email, @Field("password") String password);

    @GET("category/getAll") Call<ArrayList<ECategory>> getCategories();
}
