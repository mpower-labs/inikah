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

package com.inikah.slayer.service.persistence;

import com.inikah.slayer.model.MMCity;
import com.inikah.slayer.service.MMCityLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Ahmed Hasan
 * @generated
 */
public abstract class MMCityActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public MMCityActionableDynamicQuery() throws SystemException {
		setBaseLocalService(MMCityLocalServiceUtil.getService());
		setClass(MMCity.class);

		setClassLoader(com.inikah.slayer.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("cityId");
	}
}