package com.imooc.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.dao.GoddessDao;
import com.imooc.db.Goddess;

public class GoddessAction {
	
	public void add(Goddess goddess) throws SQLException{
		GoddessDao dao = new GoddessDao();
		dao.addGoddess(goddess);
	}
	
	public Goddess get(Integer id) throws SQLException{
		GoddessDao dao = new GoddessDao();
		return dao.get(id);
	}
	public void edit(Goddess goddess) throws SQLException{
		GoddessDao dao = new GoddessDao();
		dao.updateGoddess(goddess);
	}
	
	public void delete(Integer id) throws SQLException{
		GoddessDao dao = new GoddessDao();
		dao.deletGoddess(id);
	}
	
	public List<Goddess> query() throws SQLException{
		GoddessDao dao = new GoddessDao();
		return dao.query();
	}
	
	public List<Goddess> query(List<Map<String,Object>>params) throws SQLException{
		GoddessDao dao = new GoddessDao();
		return dao.query(params);
	}
}
//	public static void main(String[] args) throws Exception {
////		GoddessDao g = new GoddessDao();
////		List<Goddess> gs = g.query();
////		
////		for(Goddess goddess: gs){
////			System.out.println(goddess.getUser_name() + "," + goddess.getAge());	
////		}
//		GoddessDao g = new GoddessDao();
////		
//	//	List<Goddess> result = g.query("xia","1871","xiaox");
//		List<Map<String,Object>> params =  new ArrayList<Map<String,Object>>();
//		Map<String,Object> param =  new HashMap<String,Object>();
//		param.put("name","user_name");
//		param.put("rela","=");
//		param.put("value","'xiaomei'");
//		params.add(param);
//		param =  new HashMap<String,Object>();
//		param.put("name","mobile");
//		param.put("rela","like");
//		param.put("value","'%18712%'");
//		params.add(param);
//		param =  new HashMap<String,Object>();
//		param.put("name","birthday");
//		param.put("rela","like");
//		param.put("value","'%2015-05%'");
//		params.add(param);
//		List<Goddess> result = g.query(params);
//		System.out.println(result.size());
//		for(int i = 0;i < result.size();i ++){
//			System.out.println(result.get(i).toString());
//		}
////		 Goddess g1 = new Goddess();
////		 
////		 g1.setUser_name("xiaoli");
////		 g1.setAge(25);
////		 g1.setSex(1);
////		 g1.setBirthday(new Date());
////		 g1.setEmail("xiaoxia@imooc.com");
////		 g1.setMobile("18702345678");
////		 g1.setCreate_user("ADMIN");
////		 g1.setUpdate_user("ADMIN1");
////		 g1.setIsdel(1);
////		 g1.setId(3);
////		 Goddess g2 = g.get(15);
////		 System.out.println(g2.toString());
//		// g.deletGoddess(14);
//		// g.updateGoddess(g1);
//		// g.addGoddess(g1);
//		 
//	}
//}
