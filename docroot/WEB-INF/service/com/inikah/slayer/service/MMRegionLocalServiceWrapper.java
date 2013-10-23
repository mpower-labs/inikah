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
 * Provides a wrapper for {@link MMRegionLocalService}.
 *
 * @author Ahmed Hasan
 * @see MMRegionLocalService
 * @generated
 */
public class MMRegionLocalServiceWrapper implements MMRegionLocalService,
	ServiceWrapper<MMRegionLocalService> {
	public MMRegionLocalServiceWrapper(
		MMRegionLocalService mmRegionLocalService) {
		_mmRegionLocalService = mmRegionLocalService;
	}

	/**
	* Adds the m m region to the database. Also notifies the appropriate model listeners.
	*
	* @param mmRegion the m m region
	* @return the m m region that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMRegion addMMRegion(
		com.inikah.slayer.model.MMRegion mmRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.addMMRegion(mmRegion);
	}

	/**
	* Creates a new m m region with the primary key. Does not add the m m region to the database.
	*
	* @param regionId the primary key for the new m m region
	* @return the new m m region
	*/
	@Override
	public com.inikah.slayer.model.MMRegion createMMRegion(long regionId) {
		return _mmRegionLocalService.createMMRegion(regionId);
	}

	/**
	* Deletes the m m region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param regionId the primary key of the m m region
	* @return the m m region that was removed
	* @throws PortalException if a m m region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMRegion deleteMMRegion(long regionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.deleteMMRegion(regionId);
	}

	/**
	* Deletes the m m region from the database. Also notifies the appropriate model listeners.
	*
	* @param mmRegion the m m region
	* @return the m m region that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMRegion deleteMMRegion(
		com.inikah.slayer.model.MMRegion mmRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.deleteMMRegion(mmRegion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mmRegionLocalService.dynamicQuery();
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
		return _mmRegionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mmRegionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mmRegionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _mmRegionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _mmRegionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.inikah.slayer.model.MMRegion fetchMMRegion(long regionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.fetchMMRegion(regionId);
	}

	/**
	* Returns the m m region with the primary key.
	*
	* @param regionId the primary key of the m m region
	* @return the m m region
	* @throws PortalException if a m m region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMRegion getMMRegion(long regionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.getMMRegion(regionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the m m regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of m m regions
	* @param end the upper bound of the range of m m regions (not inclusive)
	* @return the range of m m regions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.inikah.slayer.model.MMRegion> getMMRegions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.getMMRegions(start, end);
	}

	/**
	* Returns the number of m m regions.
	*
	* @return the number of m m regions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMMRegionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.getMMRegionsCount();
	}

	/**
	* Updates the m m region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mmRegion the m m region
	* @return the m m region that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.MMRegion updateMMRegion(
		com.inikah.slayer.model.MMRegion mmRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mmRegionLocalService.updateMMRegion(mmRegion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _mmRegionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mmRegionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mmRegionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MMRegionLocalService getWrappedMMRegionLocalService() {
		return _mmRegionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMMRegionLocalService(
		MMRegionLocalService mmRegionLocalService) {
		_mmRegionLocalService = mmRegionLocalService;
	}

	@Override
	public MMRegionLocalService getWrappedService() {
		return _mmRegionLocalService;
	}

	@Override
	public void setWrappedService(MMRegionLocalService mmRegionLocalService) {
		_mmRegionLocalService = mmRegionLocalService;
	}

	private MMRegionLocalService _mmRegionLocalService;
}