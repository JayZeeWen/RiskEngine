package com.engine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engine.model.ModelResultHitItem;

@Service
public class RiskResultService {

	@Autowired
	private ModelResultHitItemService hitItemService ;
	
	/**
	 * 新增命中规则数据
	 * @param list
	 * @param modeId
	 * @param resultId
	 */
	public void insertResultHitItem(List<ModelResultHitItem> list,String resultId,String modelId){
		
		for (ModelResultHitItem entity : list) {
			entity.setModeId(modelId);
			entity.setResultId(resultId);
			hitItemService.insert(entity);
		}
	}
}
