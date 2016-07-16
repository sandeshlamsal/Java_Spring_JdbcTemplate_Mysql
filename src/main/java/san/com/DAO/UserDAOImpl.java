package san.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import san.com.Model.User;

public class UserDAOImpl implements UserDAO{
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplate = new JdbcTemplate(dataSource);
	   }

/*
	public void save(User User) {
		String query = "insert into User (id, name, pass) values (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, User.getId());
			ps.setString(2, User.getName());
			ps.setString(3, User.getPass());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("User saved with id="+User.getId());
			}else System.out.println("User save failed with id="+User.getId());
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

*/
	
	public void save(User User) {
		String sql = "insert into User (id, name, pass) values (?,?,?)";
	    jdbcTemplate.update(sql, User.getId(),User.getName(),User.getPass());
	    System.out.println("Record Inserted");
	
	}
	/*
	public User getById(int id) {
		String query = "select name, pass from User where id ="+id;
		User emp = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			//ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				emp = new User();
				emp.setId(id);
				emp.setName(rs.getString("name"));
				emp.setPass(rs.getString("pass"));
				System.out.println("User Found::"+emp);
			}else{
				System.out.println("No User found with id="+id);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emp;
	}


	public void update(User User) {
		String query = "update User set name=?, pass=? where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, User.getName());
			ps.setString(2, User.getPass());
			ps.setInt(3, User.getId());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("User updated with id="+User.getId());
			}else System.out.println("No User found with id="+User.getId());
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteById(int id) {
		String query = "delete from User where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("User deleted with id="+id);
			}else System.out.println("No User found with id="+id);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<User> getAll() {
		String query = "select id, name, pass from User";
		List<User> empList = new ArrayList<User>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()){
				User emp = new User();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setPass(rs.getString("pass"));
				empList.add(emp);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return empList;
	}

*/
}
