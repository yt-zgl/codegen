package com.kindo.codegen.common.tags;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 
 * 类描述：列表删除操作项标签
 * 
 * @author 张代浩
 * @date： 日期：2012-12-7 时间：上午10:17:45
 * @version 1.0
 * 
 * updated by
 * --------------------------------------
 * liujianzhu   部分精简   2017年5月15日 下午7:40:13
 */
public class DataGridDelOptTag extends TagSupport {
	private static final long serialVersionUID = 1494545685726366112L;
	protected String url;
	protected String title;
	private String message;// 询问链接的提示语
	private String exp;// 判断链接是否显示的表达式
	private String funname;// 自定义函数名称
	private String operationCode;// 按钮的操作Code
	private String urlStyle;// 样式
	private String urlclass;// 按钮样式
	private String urlfont;// 按钮图标

	public int doStartTag() throws JspTagException {
		return EVAL_PAGE;
	}

	public int doEndTag() throws JspTagException {
		Tag t = getParent();
		if(t instanceof DataGridTag) {
			DataGridTag parent = (DataGridTag) t;
			parent.setDelUrl(url, title, message, exp, funname, operationCode, urlStyle, urlclass, urlfont);
		}
		return EVAL_PAGE;
	}

	public void setFunname(String funname) {
		this.funname = funname;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	public void setUrlStyle(String urlStyle) {
		this.urlStyle = urlStyle;
	}

	public String getUrlStyle() {
		return urlStyle;
	}

	public String getUrlclass() {
		return urlclass;
	}

	public void setUrlclass(String urlclass) {
		this.urlclass = urlclass;
	}

	public String getUrlfont() {
		return urlfont;
	}

	public void setUrlfont(String urlfont) {
		this.urlfont = urlfont;
	}

}
