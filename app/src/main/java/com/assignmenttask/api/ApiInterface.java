package com.assignmenttask.api;

import com.example.example.JsonResponseModel.ActiveResponse;
import com.example.example.JsonResponseModel.UserResponse;
import com.example.example.ParshingModel.ActiveModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    //  https://mgage.solutions/SendSMS/sendmsg.php?uname=ASSCCL-OTP&pass=Assccl@17&send=ASSCCL&dest=919845696680&msg=54321%20is%20the% 20One%20Time%20Password%20for%20the%20transaction%20of%20Rs.%2049999.99. %20Your%20current%20balance%20is%20Rs.%2050000000.33.%20This%20OTP%20expi res%20in%2010%20minutes.%20-%20Spark%20Team
    @GET("sendmsg.php?uname=ASSCCL-OTP&pass=Assccl@17&send=ASSCCL&dest=919845696680&msg=54321%20is%20the% 20One%20Time%20Password%20for%20the%20transaction%20of%20Rs.%2049999.99. %20Your%20current%20balance%20is%20Rs.%2050000000.33.%20This%20OTP%20expi res%20in%2010%20minutes.%20-%20Spark%20Team")
    Call<UserResponse> getUserDetails();

}
