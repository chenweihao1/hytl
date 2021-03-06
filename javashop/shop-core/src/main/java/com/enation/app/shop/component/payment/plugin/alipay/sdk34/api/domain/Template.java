package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:45:28
 */
public class Template extends AlipayObject {

	private static final long serialVersionUID = 6225512791282472668L;

	/**
	 * 消息模板上下文，即模板中定义的参数及参数值
	 */
	@ApiField("context")
	private Context context;

	/**
	 * 消息模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public Context getContext() {
		return this.context;
	}
	public void setContext(Context context) {
		this.context = context;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
