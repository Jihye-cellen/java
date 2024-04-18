package sale;

import java.util.*;

import product.Database;

import java.sql.*;
public class SaleDAO {
	
	//판매등록
	public void insert(SaleVO vo) {
		Connection con = Database.con;
		try {
			String sql= "insert into sale(seq, code, sale_date, qnt, price) ";
			sql+="values(seq_sale.nextval, ?, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,vo.getCode());
			ps.setString(2, vo.getSale_date());
			ps.setInt(3, vo.getQnt());
			ps.setInt(4, vo.getPrice());
		}catch(Exception e) {
			System.out.println("판매등록:"+ e.toString());
		}
	}
	//매출현황
	public ArrayList<SaleVO> list(){
		Connection con = Database.con; 
		ArrayList<SaleVO> array = new ArrayList<SaleVO>();
		try {
			String sql = "select sale_date, code, name, sum(qnt) qnt , sum(price*qnt) price from view_sale group by sale_date, code, name ";
			sql +="order by sale_date, code ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setSale_date(rs.getString("sale_date"));
				vo.setCode(rs.getString("code"));
				vo.setQnt(rs.getInt("qnt"));
				vo.setPrice(rs.getInt("price"));
				vo.setName(rs.getString("name"));
				
				array.add(vo);
			}
			
		}catch(Exception e) {
			System.out.println("매출현황"+ e.toString());
		}
		return array;
	}
	
}
