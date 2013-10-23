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

import com.inikah.slayer.model.MMRegion;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the m m region service. This utility wraps {@link MMRegionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MMRegionPersistence
 * @see MMRegionPersistenceImpl
 * @generated
 */
public class MMRegionUtil {
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
	public static void clearCache(MMRegion mmRegion) {
		getPersistence().clearCache(mmRegion);
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
	public static List<MMRegion> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MMRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MMRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MMRegion update(MMRegion mmRegion) throws SystemException {
		return getPersistence().update(mmRegion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MMRegion update(MMRegion mmRegion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(mmRegion, serviceContext);
	}

	/**
	* Returns the m m region where countryId = &#63; and isoCode = &#63; or throws a {@link com.inikah.slayer.NoSuchMMRegionException} if it could not be found.
	*
	* @param countryId the country ID
	* @param isoCode the iso code
	* @return the matching m m region
	* @throws com.inikah.slayer.NoSuchMMRegionException if a matching m m region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion findByCountryId_isoCode(
		long countryId, java.lang.String isoCode)
		throws com.inikah.slayer.NoSuchMMRegionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCountryId_isoCode(countryId, isoCode);
	}

	/**
	* Returns the m m region where countryId = &#63; and isoCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param countryId the country ID
	* @param isoCode the iso code
	* @return the matching m m region, or <code>null</code> if a matching m m region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion fetchByCountryId_isoCode(
		long countryId, java.lang.String isoCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCountryId_isoCode(countryId, isoCode);
	}

	/**
	* Returns the m m region where countryId = &#63; and isoCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param countryId the country ID
	* @param isoCode the iso code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching m m region, or <code>null</code> if a matching m m region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion fetchByCountryId_isoCode(
		long countryId, java.lang.String isoCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCountryId_isoCode(countryId, isoCode,
			retrieveFromCache);
	}

	/**
	* Removes the m m region where countryId = &#63; and isoCode = &#63; from the database.
	*
	* @param countryId the country ID
	* @param isoCode the iso code
	* @return the m m region that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion removeByCountryId_isoCode(
		long countryId, java.lang.String isoCode)
		throws com.inikah.slayer.NoSuchMMRegionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByCountryId_isoCode(countryId, isoCode);
	}

	/**
	* Returns the number of m m regions where countryId = &#63; and isoCode = &#63;.
	*
	* @param countryId the country ID
	* @param isoCode the iso code
	* @return the number of matching m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCountryId_isoCode(long countryId,
		java.lang.String isoCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCountryId_isoCode(countryId, isoCode);
	}

	/**
	* Returns all the m m regions where countryId = &#63;.
	*
	* @param countryId the country ID
	* @return the matching m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMRegion> findByCountryId(
		long countryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCountryId(countryId);
	}

	/**
	* Returns a range of all the m m regions where countryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param countryId the country ID
	* @param start the lower bound of the range of m m regions
	* @param end the upper bound of the range of m m regions (not inclusive)
	* @return the range of matching m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMRegion> findByCountryId(
		long countryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCountryId(countryId, start, end);
	}

	/**
	* Returns an ordered range of all the m m regions where countryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param countryId the country ID
	* @param start the lower bound of the range of m m regions
	* @param end the upper bound of the range of m m regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMRegion> findByCountryId(
		long countryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCountryId(countryId, start, end, orderByComparator);
	}

	/**
	* Returns the first m m region in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m m region
	* @throws com.inikah.slayer.NoSuchMMRegionException if a matching m m region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion findByCountryId_First(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchMMRegionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCountryId_First(countryId, orderByComparator);
	}

	/**
	* Returns the first m m region in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m m region, or <code>null</code> if a matching m m region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion fetchByCountryId_First(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCountryId_First(countryId, orderByComparator);
	}

	/**
	* Returns the last m m region in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m m region
	* @throws com.inikah.slayer.NoSuchMMRegionException if a matching m m region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion findByCountryId_Last(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchMMRegionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCountryId_Last(countryId, orderByComparator);
	}

	/**
	* Returns the last m m region in the ordered set where countryId = &#63;.
	*
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m m region, or <code>null</code> if a matching m m region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion fetchByCountryId_Last(
		long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCountryId_Last(countryId, orderByComparator);
	}

	/**
	* Returns the m m regions before and after the current m m region in the ordered set where countryId = &#63;.
	*
	* @param regionId the primary key of the current m m region
	* @param countryId the country ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next m m region
	* @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion[] findByCountryId_PrevAndNext(
		long regionId, long countryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchMMRegionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCountryId_PrevAndNext(regionId, countryId,
			orderByComparator);
	}

	/**
	* Removes all the m m regions where countryId = &#63; from the database.
	*
	* @param countryId the country ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCountryId(long countryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCountryId(countryId);
	}

	/**
	* Returns the number of m m regions where countryId = &#63;.
	*
	* @param countryId the country ID
	* @return the number of matching m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCountryId(long countryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCountryId(countryId);
	}

	/**
	* Caches the m m region in the entity cache if it is enabled.
	*
	* @param mmRegion the m m region
	*/
	public static void cacheResult(com.inikah.slayer.model.MMRegion mmRegion) {
		getPersistence().cacheResult(mmRegion);
	}

	/**
	* Caches the m m regions in the entity cache if it is enabled.
	*
	* @param mmRegions the m m regions
	*/
	public static void cacheResult(
		java.util.List<com.inikah.slayer.model.MMRegion> mmRegions) {
		getPersistence().cacheResult(mmRegions);
	}

	/**
	* Creates a new m m region with the primary key. Does not add the m m region to the database.
	*
	* @param regionId the primary key for the new m m region
	* @return the new m m region
	*/
	public static com.inikah.slayer.model.MMRegion create(long regionId) {
		return getPersistence().create(regionId);
	}

	/**
	* Removes the m m region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param regionId the primary key of the m m region
	* @return the m m region that was removed
	* @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion remove(long regionId)
		throws com.inikah.slayer.NoSuchMMRegionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(regionId);
	}

	public static com.inikah.slayer.model.MMRegion updateImpl(
		com.inikah.slayer.model.MMRegion mmRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(mmRegion);
	}

	/**
	* Returns the m m region with the primary key or throws a {@link com.inikah.slayer.NoSuchMMRegionException} if it could not be found.
	*
	* @param regionId the primary key of the m m region
	* @return the m m region
	* @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion findByPrimaryKey(
		long regionId)
		throws com.inikah.slayer.NoSuchMMRegionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(regionId);
	}

	/**
	* Returns the m m region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param regionId the primary key of the m m region
	* @return the m m region, or <code>null</code> if a m m region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.MMRegion fetchByPrimaryKey(
		long regionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(regionId);
	}

	/**
	* Returns all the m m regions.
	*
	* @return the m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMRegion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.inikah.slayer.model.MMRegion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the m m regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of m m regions
	* @param end the upper bound of the range of m m regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.MMRegion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the m m regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of m m regions.
	*
	* @return the number of m m regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MMRegionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MMRegionPersistence)PortletBeanLocatorUtil.locate(com.inikah.slayer.service.ClpSerializer.getServletContextName(),
					MMRegionPersistence.class.getName());

			ReferenceRegistry.registerReference(MMRegionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MMRegionPersistence persistence) {
	}

	private static MMRegionPersistence _persistence;
}