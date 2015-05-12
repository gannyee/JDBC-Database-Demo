package com.imooc.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.action.GoddessAction;
import com.imooc.db.Goddess;

public class TestAction {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		GoddessAction action = new GoddessAction();
		
		Goddess g = new Goddess();
		g.setUser_name("xiaoqing");
		g.setSex(1);
		g.setAge(25);
		g.setBirthday(new Date());
		g.setEmail("xiaoqing@163.com");
		g.setMobile("15688888888");
		g.setIsdel(0);
		g.setId(17);
//		action.add(g);
//		action.edit(g);
		action.delete(17);
		List<Map<String,Object>> params = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "user_name");
		map.put("rela", "=");
		map.put("value","'xiaomei'");
		params.add(map);
		List<Goddess> result = action.query(params);
	
		for(int i = 0;i <result.size();i ++){
			System.out.println(result.get(i).getId()
					+":" + result.get(i).getUser_name());
		}
	}

}
