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

import com.inikah.slayer.model.Bridge;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the bridge service. This utility wraps {@link BridgePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see BridgePersistence
 * @see BridgePersistenceImpl
 * @generated
 */
public class BridgeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Bridge bridge) {
		getPersistence().clearCache(bridge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bridge> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bridge> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bridge> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Bridge update(Bridge bridge) throws SystemException {
		return getPersistence().update(bridge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Bridge update(Bridge bridge, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(bridge, serviceContext);
	}

	/**
	* Caches the bridge in the entity cache if it is enabled.
	*
	* @param bridge the bridge
	*/
	public static void cacheResult(com.inikah.slayer.model.Bridge bridge) {
		getPersistence().cacheResult(bridge);
	}

	/**
	* Caches the bridges in the entity cache if it is enabled.
	*
	* @param bridges the bridges
	*/
	public static void cacheResult(
		java.util.List<com.inikah.slayer.model.Bridge> bridges) {
		getPersistence().cacheResult(bridges);
	}

	/**
	* Creates a new bridge with the primary key. Does not add the bridge to the database.
	*
	* @param recId the primary key for the new bridge
	* @return the new bridge
	*/
	public static com.inikah.slayer.model.Bridge create(long recId) {
		return getPersistence().create(recId);
	}

	/**
	* Removes the bridge with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the bridge
	* @return the bridge that was removed
	* @throws com.inikah.slayer.NoSuchBridgeException if a bridge with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Bridge remove(long recId)
		throws com.inikah.slayer.NoSuchBridgeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(recId);
	}

	public static com.inikah.slayer.model.Bridge updateImpl(
		com.inikah.slayer.model.Bridge bridge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(bridge);
	}

	/**
	* Returns the bridge with the primary key or throws a {@link com.inikah.slayer.NoSuchBridgeException} if it could not be found.
	*
	* @param recId the primary key of the bridge
	* @return the bridge
	* @throws com.inikah.slayer.NoSuchBridgeException if a bridge with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Bridge findByPrimaryKey(long recId)
		throws com.inikah.slayer.NoSuchBridgeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(recId);
	}

	/**
	* Returns the bridge with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recId the primary key of the bridge
	* @return the bridge, or <code>null</code> if a bridge with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Bridge fetchByPrimaryKey(long recId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(recId);
	}

	/**
	* Returns all the bridges.
	*
	* @return the bridges
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Bridge> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bridges.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.BridgeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bridges
	* @param end the upper bound of the range of bridges (not inclusive)
	* @return the range of bridges
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Bridge> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bridges.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.BridgeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bridges
	* @param end the upper bound of the range of bridges (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bridges
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Bridge> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the bridges from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bridges.
	*
	* @return the number of bridges
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BridgePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BridgePersistence)PortletBeanLocatorUtil.locate(com.inikah.slayer.service.ClpSerializer.getServletContextName(),
					BridgePersistence.class.getName());

			ReferenceRegistry.registerReference(BridgeUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BridgePersistence persistence) {
	}

	private static BridgePersistence _persistence;
}