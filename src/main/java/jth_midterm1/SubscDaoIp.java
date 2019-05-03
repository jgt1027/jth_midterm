package jth_midterm1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class SubscDaoIp implements SubscDao {
	
		static final String  ADD_SUBSC="INSERT subscription(userId,name,channelId,title)VALUES(?,?,?,?)";
		static final String DELETE_SUBSC="DELETE FROM subscription WHERE (userId, channelId)=(?,?)";
		static final String LIST_SUBSC="SELECT userId, name, channelId,title FROM subscription WHERE userID=?";
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	RowMapper<Subsc> subscriptionRowMapper = new BeanPropertyRowMapper<>(Subsc.class);
		
	@Override
	public int addSubsc(Subsc subsc) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(ADD_SUBSC,subsc.getUserId(),subsc.getName(),subsc.getChannelId(),subsc.getTitle());
	}

	@Override
	public int deleteSubsc(String uesrId, String channelId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(DELETE_SUBSC, uesrId,channelId);
	}

	@Override
	public List<Subsc> listSubscs(String userId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(LIST_SUBSC, subscriptionRowMapper,userId);
	}

	@Override
	public void deleteSubsc(Subsc subsc) {
		// TODO Auto-generated method stub
		
	}

}
