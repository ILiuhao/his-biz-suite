
package com.doublechaintech.his.objectaccess;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.terapico.caf.baseelement.CandidateQuery;
import com.doublechaintech.his.BaseDAO;
import com.doublechaintech.his.BaseEntity;
import com.doublechaintech.his.SmartList;
import com.doublechaintech.his.MultipleAccessKey;
import com.doublechaintech.his.HisUserContext;

import com.doublechaintech.his.userapp.UserApp;

import com.doublechaintech.his.userapp.UserAppDAO;


public interface ObjectAccessDAO extends BaseDAO{

	public SmartList<ObjectAccess> loadAll();
	public ObjectAccess load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<ObjectAccess> objectAccessList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public ObjectAccess present(ObjectAccess objectAccess,Map<String,Object> options) throws Exception;
	public ObjectAccess clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public ObjectAccess save(ObjectAccess objectAccess,Map<String,Object> options);
	public SmartList<ObjectAccess> saveObjectAccessList(SmartList<ObjectAccess> objectAccessList,Map<String,Object> options);
	public SmartList<ObjectAccess> removeObjectAccessList(SmartList<ObjectAccess> objectAccessList,Map<String,Object> options);
	public SmartList<ObjectAccess> findObjectAccessWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countObjectAccessWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countObjectAccessWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String objectAccessId, int version) throws Exception;
	public ObjectAccess disconnectFromAll(String objectAccessId, int version) throws Exception;
	public int deleteAll() throws Exception;

	
	
	
	public SmartList<ObjectAccess> queryList(String sql, Object ... parmeters);
	public int count(String sql, Object ... parmeters);
	public CandidateObjectAccess executeCandidatesQuery(CandidateQuery query, String sql, Object ... parmeters) throws Exception ;
 
 	public SmartList<ObjectAccess> findObjectAccessByApp(String userAppId, Map<String,Object> options);
 	public int countObjectAccessByApp(String userAppId, Map<String,Object> options);
 	public Map<String, Integer> countObjectAccessByAppIds(String[] ids, Map<String,Object> options);
 	public SmartList<ObjectAccess> findObjectAccessByApp(String userAppId, int start, int count, Map<String,Object> options);
 	public void analyzeObjectAccessByApp(SmartList<ObjectAccess> resultList, String userAppId, Map<String,Object> options);

 
 
}


