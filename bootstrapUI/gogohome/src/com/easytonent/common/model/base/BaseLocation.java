package com.easytonent.common.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLocation<M extends BaseLocation<M>> extends Model<M> implements IBean {

	public void setDriverId(java.lang.String driverId) {
		set("driverId", driverId);
	}

	public java.lang.String getDriverId() {
		return get("driverId");
	}

	public void setLat(java.lang.String lat) {
		set("lat", lat);
	}

	public java.lang.String getLat() {
		return get("lat");
	}

	public void setLng(java.lang.String lng) {
		set("lng", lng);
	}

	public java.lang.String getLng() {
		return get("lng");
	}

}
