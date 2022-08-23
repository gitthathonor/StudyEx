package json.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import json.dto.Area;

public class AreaDao {
	
	private Connection conn;
	
	public AreaDao() {
		
	}

	public AreaDao(Connection conn) {
		this.conn = conn;
	}
	
	public int insert(Area area) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO area ");
			sql.append("VALUES(?, ?, ?, ?, ?, ?)");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, area.getSeq());
			pstmt.setString(2, area.getPlace());
			pstmt.setString(3, area.getTitle());
			pstmt.setString(4, area.getSubtitle());
			pstmt.setString(5, area.getAddr());
			pstmt.setString(6, area.getTel());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Area findById(int seq) {
		Area area = new Area();
		try {
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM area WHERE seq = ?");
			pstmt.setInt(1, seq);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				area.setSeq(seq);
				area.setPlace(rs.getString("place"));
				area.setTitle(rs.getString("title"));
				area.setSubtitle(rs.getString("subtitle"));
				area.setAddr(rs.getString("addr"));
				area.setTel(rs.getString("tel"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return area;
	}
	
	public ArrayList<Area> findAll() {
		ArrayList<Area> areaList = new ArrayList<>();
		try {
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM area ORDER BY seq");

			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Area area = new Area();
				area.setSeq(rs.getInt("seq"));
				area.setPlace(rs.getString("place"));
				area.setTitle(rs.getString("title"));
				area.setSubtitle(rs.getString("subtitle"));
				area.setAddr(rs.getString("addr"));
				area.setTel(rs.getString("tel"));
				areaList.add(area);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return areaList;
	}
	
//	public int updateById(int seq, Area area) {
//		int result = -1;
//		try {
//			StringBuilder sql = new StringBuilder();
//			sql.append("UPDATE area SET username = ?, password = ?, email = ? ");
//			sql.append("WHERE id = ?");
//			
//			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
//			pstmt.setString(1, customer.getUsername());
//			pstmt.setString(2, customer.getPassword());
//			pstmt.setString(3, customer.getEmail());
//			pstmt.setInt(4, id);
//			result = pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//	
//	public int deleteById(int id) {
//		int result = -1;
//		try {
//			StringBuilder sql = new StringBuilder();
//			sql.append("DELETE FROM customer WHERE id = ?");
//			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
//			pstmt.setInt(1, id);
//			result = pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//	
	
	
}
