package json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;

import com.google.gson.Gson;

import json.db.DBConnection;
import json.dto.RespDto;

public class MainApp {
	
	public static void main(String[] args) {
		
		Connection connection = DBConnection.connection();
		
		
		
		try {
			URL url = new URL("http://apis.data.go.kr/6260000/AttractionService/getAttractionKr?serviceKey=YF2x%2FO1BlpMsxJQE9EcsZinR9%2FtVU8Ho4qbE9OTsA3eU19TPByqfFMTzVq4oP8WQLesJOA4G13m7qRYpx9KqXQ%3D%3D&pageNo=1&numOfRows=3&resultType=json");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			// BufferedReader 사용
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			
			StringBuilder sb = new StringBuilder();
			String temp = "";
			
			while((temp = br.readLine()) != null) {
				sb.append(temp);
			}
			
			//json처럼 생긴 String을 RespDto로 변환
			Gson gson = new Gson();
			RespDto respDto = gson.fromJson(sb.toString(), RespDto.class);
			
			
			
			
			System.out.println(respDto.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}

