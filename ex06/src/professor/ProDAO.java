package professor;

import java.util.*;
import java.sql.*;

public class ProDAO {
	Connection con = Database.con;
	//교수등록
	public void insert(ProVO vo) {
		try {
			String sql = "insert into professors(pcode,pname,dept,hiredate,title,salary)";
					sql+= "values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, vo.getPcode());
			ps.setString(2, vo.getPname());
			ps.setString(3, vo.getDept());
			ps.setString(4, vo.getHiredate());
			ps.setString(5, vo.getTitle());
			ps.setInt(6, vo.getSalary());
			ps.execute();
			
		}catch(Exception e){
		 System.out.println("교수등록:" + e.toString());
		}
	}

	//목록출력
	public ArrayList<ProVO> list(){
		ArrayList<ProVO> array= new ArrayList<ProVO>();
		try {
			String sql="select * from professors";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				ProVO vo = new ProVO();
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setDept(rs.getString("dept"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setTitle(rs.getString("title"));
				vo.setSalary(rs.getInt("salary"));
				
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("교수목록:"+ e.toString());
		}
		return array;
	}
}