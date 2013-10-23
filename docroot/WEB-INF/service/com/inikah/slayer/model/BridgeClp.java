/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inikah.slayer.model;

import com.inikah.slayer.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class BridgeClp extends BaseModelImpl<Bridge> implements Bridge {
	public BridgeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Bridge.class;
	}

	@Override
	public String getModelClassName() {
		return Bridge.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _recId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRecId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _recId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("recId", getRecId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long recId = (Long)attributes.get("recId");

		if (recId != null) {
			setRecId(recId);
		}
	}

	@Override
	public long getRecId() {
		return _recId;
	}

	@Override
	public void setRecId(long recId) {
		_recId = recId;

		if (_bridgeRemoteModel != null) {
			try {
				Class<?> clazz = _bridgeRemoteModel.getClass();

				Method method = clazz.getMethod("setRecId", long.class);

				method.invoke(_bridgeRemoteModel, recId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBridgeRemoteModel() {
		return _bridgeRemoteModel;
	}

	public void setBridgeRemoteModel(BaseModel<?> bridgeRemoteModel) {
		_bridgeRemoteModel = bridgeRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _bridgeRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_bridgeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public Bridge toEscapedModel() {
		return (Bridge)ProxyUtil.newProxyInstance(Bridge.class.getClassLoader(),
			new Class[] { Bridge.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BridgeClp clone = new BridgeClp();

		clone.setRecId(getRecId());

		return clone;
	}

	@Override
	public int compareTo(Bridge bridge) {
		long primaryKey = bridge.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BridgeClp)) {
			return false;
		}

		BridgeClp bridge = (BridgeClp)obj;

		long primaryKey = bridge.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{recId=");
		sb.append(getRecId());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("com.inikah.slayer.model.Bridge");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>recId</column-name><column-value><![CDATA[");
		sb.append(getRecId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _recId;
	private BaseModel<?> _bridgeRemoteModel;
}