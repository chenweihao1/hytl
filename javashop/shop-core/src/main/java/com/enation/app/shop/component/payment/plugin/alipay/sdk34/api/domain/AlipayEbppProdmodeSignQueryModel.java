package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 查询签约信息接口
 *
 * @author auto create
 * @since 1.0, 2016-12-27 10:52:19
 */
public class AlipayEbppProdmodeSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4289587652713923661L;

	/**
	 * 出账/销账机构支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 产品编号
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
