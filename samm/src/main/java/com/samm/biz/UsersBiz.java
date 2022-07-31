package com.samm.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samm.frame.Biz;
import com.samm.mapper.UsersMapper;
import com.samm.vo.UsersVo;
 

@Service
public class UsersBiz implements Biz<String,UsersVo> {
	
    @Autowired
    UsersMapper usersDao;

    @Override
    public void register(UsersVo v) throws Exception {
        usersDao.insert(v);
    }

    @Override
    public void modify(UsersVo v) throws Exception {
        usersDao.update(v);
    }

    @Override
    public void remove(String k) throws Exception {
        usersDao.delete(k);
    }

    @Override
    public UsersVo get(String k) throws Exception {
        UsersVo result = usersDao.select(k);
        return result;
    }

    @Override
    public List<UsersVo> get() throws Exception {
        List<UsersVo> result = usersDao.selectAll();
        return result;
    }
    
    
    
    public String idCheck(String k) throws Exception{
		return usersDao.idCheck(k);    	
    }

	public int getTotalNum() throws Exception {		
		return usersDao.getTotalNum();
	}

	public List<UsersVo> selectlist(Map<String, Integer> Map) throws Exception {
		return usersDao.selectlist(Map);
	}

	public List<UsersVo> msearch(Map<String, String> map) throws Exception {
		return usersDao.msearch(map);
	}
	
	public void kakaoLogin(UsersVo v) throws Exception{
		usersDao.kakaoLogin(v);
	}
 
	
}
