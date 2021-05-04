package com.te.ecom.service;

import java.util.List;

import com.te.ecom.beans.AdminBean;
import com.te.ecom.beans.ItemBean;

public interface AdminService {
	
	public AdminBean authenticate(Integer aid, String password);
	
	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);
	
	public boolean updateItem(ItemBean infoBean);
	
	public boolean deleteItem(Integer id);
	
	public List<ItemBean> getAllEmployeeDetails();

}
