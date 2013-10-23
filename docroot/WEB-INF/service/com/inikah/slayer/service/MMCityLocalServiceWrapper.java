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

package com.inikah.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MMCityLocalService}.
 *
 * @author Ahmed Hasan
 * @see MMCityLocalService
 * @generated
 */
public class MMCityLocalServiceWrapper implements MMCityLocalService,
	ServiceWrapper<MMCityLocalService> {
	public MMCityLocalServiceWrapper(MMCityLocalService mmCityLocalService) {
		_mmCityLocalService = mmCityLocalService;
	}

	/**
	* Adds the m m city to the database. Also notifies the appropriate model listeners.
	*
	* @param mmCity the m m city
	* @return the m m city that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMCity addMMCity(
		com.inikah.slayer.model.MMCity mmCity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.addMMCity(mmCity);
	}

	/**
	* Creates a new m m city with the primary key. Does not add the m m city to the database.
	*
	* @param cityId the primary key for the new m m city
	* @return the new m m city
	*/
	@Override
	public com.inikah.slayer.model.MMCity createMMCity(long cityId) {
		return _mmCityLocalService.createMMCity(cityId);
	}

	/**
	* Deletes the m m city with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cityId the primary key of the m m city
	* @return the m m city that was removed
	* @throws PortalException if a m m city with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMCity deleteMMCity(long cityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.deleteMMCity(cityId);
	}

	/**
	* Deletes the m m city from the database. Also notifies the appropriate model listeners.
	*
	* @param mmCity the m m city
	* @return the m m city that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMCity deleteMMCity(
		com.inikah.slayer.model.MMCity mmCity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.deleteMMCity(mmCity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mmCityLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.inikah.slayer.model.MMCity fetchMMCity(long cityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.fetchMMCity(cityId);
	}

	/**
	* Returns the m m city with the primary key.
	*
	* @param cityId the primary key of the m m city
	* @return the m m city
	* @throws PortalException if a m m city with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMCity getMMCity(long cityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.getMMCity(cityId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the m m cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of m m cities
	* @param end the upper bound of the range of m m cities (not inclusive)
	* @return the range of m m cities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.inikah.slayer.model.MMCity> getMMCities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.getMMCities(start, end);
	}

	/**
	* Returns the number of m m cities.
	*
	* @return the number of m m cities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMMCitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.getMMCitiesCount();
	}

	/**
	* Updates the m m city in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mmCity the m m city
	* @return the m m city that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMCity updateMMCity(
		com.inikah.slayer.model.MMCity mmCity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmCityLocalService.updateMMCity(mmCity);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _mmCityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mmCityLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mmCityLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MMCityLocalService getWrappedMMCityLocalService() {
		return _mmCityLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMMCityLocalService(
		MMCityLocalService mmCityLocalService) {
		_mmCityLocalService = mmCityLocalService;
	}

	@Override
	public MMCityLocalService getWrappedService() {
		return _mmCityLocalService;
	}

	@Override
	public void setWrappedService(MMCityLocalService mmCityLocalService) {
		_mmCityLocalService = mmCityLocalService;
	}

	private MMCityLocalService _mmCityLocalService;
}