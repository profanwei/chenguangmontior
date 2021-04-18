package com.nuaa.chenguangmontior.model;

import lombok.Data;

import java.util.List;
@Data
public class LoadAllMenuBean {
	private String  id;
	private String  text;
	private String  iconCls;
	private String  pid;
	private String pagelevel;
	private String url ;
	private List<LoadAllMenuBean> children;
	

}
