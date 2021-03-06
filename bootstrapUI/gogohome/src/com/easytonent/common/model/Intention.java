package com.easytonent.common.model;

import com.easytonent.common.model.base.BaseIntention;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Intention extends BaseIntention<Intention> {
	public static final Intention dao = new Intention();

	public Intention findByIdAndOrderNo(String uuid, String orderNo) {
		return findFirst("select * from intention where id=? and orderNo=?", uuid, orderNo);
	}
}
