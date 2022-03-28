package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.BackgroundSyncDao;
import com.example.demo.Dao.TurbohireDao;
import com.example.demo.Model.BackgroundSync;
import com.example.demo.Model.TurbohireDummy;

@Service
public class BackgroundSyncService {

	
	@Autowired
	private BackgroundSyncDao dao;
	
	public BackgroundSyncService() {}
	public BackgroundSyncService(BackgroundSyncDao dao) {
		super();
		this.dao = dao;
	}
	 public void SaveBackgroundSync(BackgroundSync backgroundsync) {
			dao.save(backgroundsync);
		}
	 
	 
		public List<BackgroundSync> showAllInterviewers(){
		return (List<BackgroundSync>) dao.findAll();
	}
		@Autowired
		private TurbohireDao turbodao;
		
		 public void SaveTurbohireDummy(TurbohireDummy turbohiredummy) {
			 turbodao.save(turbohiredummy);
			}

}
