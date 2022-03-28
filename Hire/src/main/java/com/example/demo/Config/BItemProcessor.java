package com.example.demo.Config;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.Model.BackgroundSync;

public class BItemProcessor implements ItemProcessor<BackgroundSync,BackgroundSync>{

	@Override
	public BackgroundSync process(BackgroundSync tdata) throws Exception {
		// TODO Auto-generated method stub
		return tdata;
	}

}
