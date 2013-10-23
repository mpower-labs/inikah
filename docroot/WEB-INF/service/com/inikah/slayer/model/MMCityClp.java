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
import com.inikah.slayer.service.MMCityLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
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
public class MMCityClp extends BaseModelImpl<MMCity> implements MMCity {
	public MMCityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MMCity.class;
	}

	@Override
	public String getModelClassName() {
		return MMCity.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _cityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cityId", getCityId());
		attributes.put("regionId", getRegionId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cityId = (Long)attributes.get("cityId");

		if (cityId != null) {
			setCityId(cityId);
		}

		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public long getCityId() {
		return _cityId;
	}

	@Override
	public void setCityId(long cityId) {
		_cityId = cityId;

		if (_mmCityRemoteModel != null) {
			try {
				Class<?> clazz = _mmCityRemoteModel.getClass();

				Method method = clazz.getMethod("setCityId", long.class);

				method.invoke(_mmCityRemoteModel, cityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegionId() {
		return _regionId;
	}

	@Override
	public void setRegionId(long regionId) {
		_regionId = regionId;

		if (_mmCityRemoteModel != null) {
			try {
				Class<?> clazz = _mmCityRemoteModel.getClass();

				Method method = clazz.getMethod("setRegionId", long.class);

				method.invoke(_mmCityRemoteModel, regionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_mmCityRemoteModel != null) {
			try {
				Class<?> clazz = _mmCityRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_mmCityRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMMCityRemoteModel() {
		return _mmCityRemoteModel;
	}

	public void setMMCityRemoteModel(BaseModel<?> mmCityRemoteModel) {
		_mmCityRemoteModel = mmCityRemoteModel;
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

		Class<?> remoteModelClass = _mmCityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_mmCityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MMCityLocalServiceUtil.addMMCity(this);
		}
		else {
			MMCityLocalServiceUtil.updateMMCity(this);
		}
	}

	@Override
	public MMCity toEscapedModel() {
		return (MMCity)ProxyUtil.newProxyInstance(MMCity.class.getClassLoader(),
			new Class[] { MMCity.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MMCityClp clone = new MMCityClp();

		clone.setCityId(getCityId());
		clone.setRegionId(getRegionId());
		clone.setName(getName());

		return clone;
	}

	@Override
	public int compareTo(MMCity mmCity) {
		long primaryKey = mmCity.getPrimaryKey();

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

		if (!(obj instanceof MMCityClp)) {
			return false;
		}

		MMCityClp mmCity = (MMCityClp)obj;

		long primaryKey = mmCity.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{cityId=");
		sb.append(getCityId());
		sb.append(", regionId=");
		sb.append(getRegionId());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.inikah.slayer.model.MMCity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cityId</column-name><column-value><![CDATA[");
		sb.append(getCityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regionId</column-name><column-value><![CDATA[");
		sb.append(getRegionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cityId;
	private long _regionId;
	private String _name;
	private BaseModel<?> _mmCityRemoteModel;
}