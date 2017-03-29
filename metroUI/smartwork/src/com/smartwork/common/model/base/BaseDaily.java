package com.smartwork.common.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDaily<M extends BaseDaily<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setBegin(java.util.Date begin) {
		set("begin", begin);
	}

	public java.util.Date getBegin() {
		return get("begin");
	}

	public void setEnd(java.util.Date end) {
		set("end", end);
	}

	public java.util.Date getEnd() {
		return get("end");
	}

	public void setContactsId(java.lang.String contactsId) {
		set("contactsId", contactsId);
	}

	public java.lang.String getContactsId() {
		return get("contactsId");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

}
