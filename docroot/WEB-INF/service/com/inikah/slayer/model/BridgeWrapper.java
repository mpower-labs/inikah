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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bridge}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Bridge
 * @generated
 */
public class BridgeWrapper implements Bridge, ModelWrapper<Bridge> {
	public BridgeWrapper(Bridge bridge) {
		_bridge = bridge;
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

	/**
	* Returns the primary key of this bridge.
	*
	* @return the primary key of this bridge
	*/
	@Override
	public long getPrimaryKey() {
		return _bridge.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bridge.
	*
	* @param primaryKey the primary key of this bridge
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bridge.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rec ID of this bridge.
	*
	* @return the rec ID of this bridge
	*/
	@Override
	public long getRecId() {
		return _bridge.getRecId();
	}

	/**
	* Sets the rec ID of this bridge.
	*
	* @param recId the rec ID of this bridge
	*/
	@Override
	public void setRecId(long recId) {
		_bridge.setRecId(recId);
	}

	@Override
	public boolean isNew() {
		return _bridge.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bridge.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bridge.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bridge.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bridge.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bridge.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bridge.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bridge.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bridge.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bridge.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bridge.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BridgeWrapper((Bridge)_bridge.clone());
	}

	@Override
	public int compareTo(com.inikah.slayer.model.Bridge bridge) {
		return _bridge.compareTo(bridge);
	}

	@Override
	public int hashCode() {
		return _bridge.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.inikah.slayer.model.Bridge> toCacheModel() {
		return _bridge.toCacheModel();
	}

	@Override
	public com.inikah.slayer.model.Bridge toEscapedModel() {
		return new BridgeWrapper(_bridge.toEscapedModel());
	}

	@Override
	public com.inikah.slayer.model.Bridge toUnescapedModel() {
		return new BridgeWrapper(_bridge.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bridge.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bridge.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BridgeWrapper)) {
			return false;
		}

		BridgeWrapper bridgeWrapper = (BridgeWrapper)obj;

		if (Validator.equals(_bridge, bridgeWrapper._bridge)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Bridge getWrappedBridge() {
		return _bridge;
	}

	@Override
	public Bridge getWrappedModel() {
		return _bridge;
	}

	@Override
	public void resetOriginalValues() {
		_bridge.resetOriginalValues();
	}

	private Bridge _bridge;
}