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

package com.inikah.slayer.model.impl;

import com.inikah.slayer.model.Bridge;
import com.inikah.slayer.model.BridgeModel;
import com.inikah.slayer.model.BridgeSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Bridge service. Represents a row in the &quot;inikah_Bridge&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.inikah.slayer.model.BridgeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BridgeImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see BridgeImpl
 * @see com.inikah.slayer.model.Bridge
 * @see com.inikah.slayer.model.BridgeModel
 * @generated
 */
@JSON(strict = true)
public class BridgeModelImpl extends BaseModelImpl<Bridge>
	implements BridgeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bridge model instance should use the {@link com.inikah.slayer.model.Bridge} interface instead.
	 */
	public static final String TABLE_NAME = "inikah_Bridge";
	public static final Object[][] TABLE_COLUMNS = {
			{ "recId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table inikah_Bridge (recId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table inikah_Bridge";
	public static final String ORDER_BY_JPQL = " ORDER BY bridge.recId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY inikah_Bridge.recId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.inikah.slayer.model.Bridge"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.inikah.slayer.model.Bridge"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Bridge toModel(BridgeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Bridge model = new BridgeImpl();

		model.setRecId(soapModel.getRecId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Bridge> toModels(BridgeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Bridge> models = new ArrayList<Bridge>(soapModels.length);

		for (BridgeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.inikah.slayer.model.Bridge"));

	public BridgeModelImpl() {
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
	public Class<?> getModelClass() {
		return Bridge.class;
	}

	@Override
	public String getModelClassName() {
		return Bridge.class.getName();
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

	@JSON
	@Override
	public long getRecId() {
		return _recId;
	}

	@Override
	public void setRecId(long recId) {
		_recId = recId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Bridge.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Bridge toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Bridge)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BridgeImpl bridgeImpl = new BridgeImpl();

		bridgeImpl.setRecId(getRecId());

		bridgeImpl.resetOriginalValues();

		return bridgeImpl;
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

		if (!(obj instanceof Bridge)) {
			return false;
		}

		Bridge bridge = (Bridge)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Bridge> toCacheModel() {
		BridgeCacheModel bridgeCacheModel = new BridgeCacheModel();

		bridgeCacheModel.recId = getRecId();

		return bridgeCacheModel;
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

	private static ClassLoader _classLoader = Bridge.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Bridge.class };
	private long _recId;
	private Bridge _escapedModel;
}