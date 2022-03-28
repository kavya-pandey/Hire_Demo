package com.example.demo.Config;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.Model.TurbohireDummy;


@Component
public class MyCustomReader extends JdbcCursorItemReader<TurbohireDummy> implements ItemReader<TurbohireDummy>{
	
	public MyCustomReader(@Autowired DataSource primaryDataSource) {
		setDataSource(primaryDataSource);
		setSql("SELECT interviewid,interviewemail,applicantname,finalverdict,roundid,timeslot FROM TurbohireDummy");
				 
		setFetchSize(100);
		setRowMapper(new bsyncRowMapper());
	}
	
	public class bsyncRowMapper implements RowMapper<TurbohireDummy> {
		@Override
		public TurbohireDummy mapRow(ResultSet rs, int rowNum) throws SQLException {
			TurbohireDummy bsync  = new TurbohireDummy();
			bsync.setInterviewid(rs.getInt("interviewid"));
			bsync.setInterviewemail(rs.getString("interviewemail"));
			bsync.setApplicantname(rs.getString("applicantname"));
			bsync.setFinalverdict(rs.getString("finalverdict"));
			bsync.setRoundid(rs.getInt("roundid"));
			bsync.setTimeslot(rs.getString("timeslot"));
			return bsync;
		}
	}
}