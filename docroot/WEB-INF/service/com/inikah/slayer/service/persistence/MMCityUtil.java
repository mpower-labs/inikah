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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the m m city service. This utility wraps {@link MMCityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MMCityPersistence
 * @see MMCityPersistenceImpl
 * @generated
 */
public class MMCityUtil {
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
	public static void clearCache(MMCity mmCity) {
		getPersistence().clearCache(mmCity);
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
	public static List<MMCity> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MMCity> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MMCity> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MMCity update(MMCity mmCity) throws SystemException {
		return getPersistence().update(mmCity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MMCity update(MMCity mmCity, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(mmCity, serviceContext);
	}

	/**
	* Returns the m m city where regionId = &#63; and name = &#63; or throws a {@link com.inikah.slayer.NoSuchMMCityException} if it could not be found.
	*
	* @param regionId the region ID
	* @param name the name
	* @return the matching m m city
	* @throws com.inikah.slayer.NoSuchMMCityException if a matching m m city could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity findByRegionId_Name(
		long regionId, java.lang.String name)
		throws com.inikah.slayer.NoSuchMMCityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRegionId_Name(regionId, name);
	}

	/**
	* Returns the m m city where regionId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param regionId the region ID
	* @param name the name
	* @return the matching m m city, or <code>null</code> if a matching m m city could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity fetchByRegionId_Name(
		long regionId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRegionId_Name(regionId, name);
	}

	/**
	* Returns the m m city where regionId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param regionId the region ID
	* @param name the name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching m m city, or <code>null</code> if a matching m m city could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity fetchByRegionId_Name(
		long regionId, java.lang.String name, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegionId_Name(regionId, name, retrieveFromCache);
	}

	/**
	* Removes the m m city where regionId = &#63; and name = &#63; from the database.
	*
	* @param regionId the region ID
	* @param name the name
	* @return the m m city that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity removeByRegionId_Name(
		long regionId, java.lang.String name)
		throws com.inikah.slayer.NoSuchMMCityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByRegionId_Name(regionId, name);
	}

	/**
	* Returns the number of m m cities where regionId = &#63; and name = &#63;.
	*
	* @param regionId the region ID
	* @param name the name
	* @return the number of matching m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegionId_Name(long regionId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRegionId_Name(regionId, name);
	}

	/**
	* Returns all the m m cities where regionId = &#63;.
	*
	* @param regionId the region ID
	* @return the matching m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMCity> findByRegionId(
		long regionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRegionId(regionId);
	}

	/**
	* Returns a range of all the m m cities where regionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param regionId the region ID
	* @param start the lower bound of the range of m m cities
	* @param end the upper bound of the range of m m cities (not inclusive)
	* @return the range of matching m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMCity> findByRegionId(
		long regionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRegionId(regionId, start, end);
	}

	/**
	* Returns an ordered range of all the m m cities where regionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param regionId the region ID
	* @param start the lower bound of the range of m m cities
	* @param end the upper bound of the range of m m cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMCity> findByRegionId(
		long regionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegionId(regionId, start, end, orderByComparator);
	}

	/**
	* Returns the first m m city in the ordered set where regionId = &#63;.
	*
	* @param regionId the region ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m m city
	* @throws com.inikah.slayer.NoSuchMMCityException if a matching m m city could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity findByRegionId_First(
		long regionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchMMCityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRegionId_First(regionId, orderByComparator);
	}

	/**
	* Returns the first m m city in the ordered set where regionId = &#63;.
	*
	* @param regionId the region ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m m city, or <code>null</code> if a matching m m city could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity fetchByRegionId_First(
		long regionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegionId_First(regionId, orderByComparator);
	}

	/**
	* Returns the last m m city in the ordered set where regionId = &#63;.
	*
	* @param regionId the region ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m m city
	* @throws com.inikah.slayer.NoSuchMMCityException if a matching m m city could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity findByRegionId_Last(
		long regionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchMMCityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRegionId_Last(regionId, orderByComparator);
	}

	/**
	* Returns the last m m city in the ordered set where regionId = &#63;.
	*
	* @param regionId the region ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m m city, or <code>null</code> if a matching m m city could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity fetchByRegionId_Last(
		long regionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRegionId_Last(regionId, orderByComparator);
	}

	/**
	* Returns the m m cities before and after the current m m city in the ordered set where regionId = &#63;.
	*
	* @param cityId the primary key of the current m m city
	* @param regionId the region ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next m m city
	* @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity[] findByRegionId_PrevAndNext(
		long cityId, long regionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchMMCityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegionId_PrevAndNext(cityId, regionId,
			orderByComparator);
	}

	/**
	* Removes all the m m cities where regionId = &#63; from the database.
	*
	* @param regionId the region ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRegionId(long regionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRegionId(regionId);
	}

	/**
	* Returns the number of m m cities where regionId = &#63;.
	*
	* @param regionId the region ID
	* @return the number of matching m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegionId(long regionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRegionId(regionId);
	}

	/**
	* Caches the m m city in the entity cache if it is enabled.
	*
	* @param mmCity the m m city
	*/
	public static void cacheResult(com.inikah.slayer.model.MMCity mmCity) {
		getPersistence().cacheResult(mmCity);
	}

	/**
	* Caches the m m cities in the entity cache if it is enabled.
	*
	* @param mmCities the m m cities
	*/
	public static void cacheResult(
		java.util.List<com.inikah.slayer.model.MMCity> mmCities) {
		getPersistence().cacheResult(mmCities);
	}

	/**
	* Creates a new m m city with the primary key. Does not add the m m city to the database.
	*
	* @param cityId the primary key for the new m m city
	* @return the new m m city
	*/
	public static com.inikah.slayer.model.MMCity create(long cityId) {
		return getPersistence().create(cityId);
	}

	/**
	* Removes the m m city with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cityId the primary key of the m m city
	* @return the m m city that was removed
	* @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity remove(long cityId)
		throws com.inikah.slayer.NoSuchMMCityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cityId);
	}

	public static com.inikah.slayer.model.MMCity updateImpl(
		com.inikah.slayer.model.MMCity mmCity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(mmCity);
	}

	/**
	* Returns the m m city with the primary key or throws a {@link com.inikah.slayer.NoSuchMMCityException} if it could not be found.
	*
	* @param cityId the primary key of the m m city
	* @return the m m city
	* @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity findByPrimaryKey(long cityId)
		throws com.inikah.slayer.NoSuchMMCityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cityId);
	}

	/**
	* Returns the m m city with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cityId the primary key of the m m city
	* @return the m m city, or <code>null</code> if a m m city with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMCity fetchByPrimaryKey(long cityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cityId);
	}

	/**
	* Returns all the m m cities.
	*
	* @return the m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMCity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.inikah.slayer.model.MMCity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the m m cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of m m cities
	* @param end the upper bound of the range of m m cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMCity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the m m cities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of m m cities.
	*
	* @return the number of m m cities
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MMCityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MMCityPersistence)PortletBeanLocatorUtil.locate(com.inikah.slayer.service.ClpSerializer.getServletContextName(),
					MMCityPersistence.class.getName());

			ReferenceRegistry.registerReference(MMCityUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MMCityPersistence persistence) {
	}

	private static MMCityPersistence _persistence;
}