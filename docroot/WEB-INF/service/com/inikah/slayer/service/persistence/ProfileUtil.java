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

import com.inikah.slayer.model.Profile;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the profile service. This utility wraps {@link ProfilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see ProfilePersistence
 * @see ProfilePersistenceImpl
 * @generated
 */
public class ProfileUtil {
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
	public static void clearCache(Profile profile) {
		getPersistence().clearCache(profile);
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
	public static List<Profile> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Profile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Profile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Profile update(Profile profile) throws SystemException {
		return getPersistence().update(profile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Profile update(Profile profile, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(profile, serviceContext);
	}

	/**
	* Returns all the profiles where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching profiles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Profile> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the profiles where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.ProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of profiles
	* @param end the upper bound of the range of profiles (not inclusive)
	* @return the range of matching profiles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Profile> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the profiles where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.ProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of profiles
	* @param end the upper bound of the range of profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching profiles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Profile> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first profile in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching profile
	* @throws com.inikah.slayer.NoSuchProfileException if a matching profile could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchProfileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first profile in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching profile, or <code>null</code> if a matching profile could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last profile in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching profile
	* @throws com.inikah.slayer.NoSuchProfileException if a matching profile could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchProfileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last profile in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching profile, or <code>null</code> if a matching profile could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the profiles before and after the current profile in the ordered set where userId = &#63;.
	*
	* @param profileId the primary key of the current profile
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next profile
	* @throws com.inikah.slayer.NoSuchProfileException if a profile with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile[] findByUserId_PrevAndNext(
		long profileId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.inikah.slayer.NoSuchProfileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId_PrevAndNext(profileId, userId,
			orderByComparator);
	}

	/**
	* Removes all the profiles where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of profiles where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching profiles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the profile where userId = &#63; and emailAddress = &#63; or throws a {@link com.inikah.slayer.NoSuchProfileException} if it could not be found.
	*
	* @param userId the user ID
	* @param emailAddress the email address
	* @return the matching profile
	* @throws com.inikah.slayer.NoSuchProfileException if a matching profile could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile findByUserId_EmailAddress(
		long userId, java.lang.String emailAddress)
		throws com.inikah.slayer.NoSuchProfileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_EmailAddress(userId, emailAddress);
	}

	/**
	* Returns the profile where userId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param emailAddress the email address
	* @return the matching profile, or <code>null</code> if a matching profile could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile fetchByUserId_EmailAddress(
		long userId, java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_EmailAddress(userId, emailAddress);
	}

	/**
	* Returns the profile where userId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param emailAddress the email address
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching profile, or <code>null</code> if a matching profile could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile fetchByUserId_EmailAddress(
		long userId, java.lang.String emailAddress, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserId_EmailAddress(userId, emailAddress,
			retrieveFromCache);
	}

	/**
	* Removes the profile where userId = &#63; and emailAddress = &#63; from the database.
	*
	* @param userId the user ID
	* @param emailAddress the email address
	* @return the profile that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile removeByUserId_EmailAddress(
		long userId, java.lang.String emailAddress)
		throws com.inikah.slayer.NoSuchProfileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUserId_EmailAddress(userId, emailAddress);
	}

	/**
	* Returns the number of profiles where userId = &#63; and emailAddress = &#63;.
	*
	* @param userId the user ID
	* @param emailAddress the email address
	* @return the number of matching profiles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId_EmailAddress(long userId,
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId_EmailAddress(userId, emailAddress);
	}

	/**
	* Caches the profile in the entity cache if it is enabled.
	*
	* @param profile the profile
	*/
	public static void cacheResult(com.inikah.slayer.model.Profile profile) {
		getPersistence().cacheResult(profile);
	}

	/**
	* Caches the profiles in the entity cache if it is enabled.
	*
	* @param profiles the profiles
	*/
	public static void cacheResult(
		java.util.List<com.inikah.slayer.model.Profile> profiles) {
		getPersistence().cacheResult(profiles);
	}

	/**
	* Creates a new profile with the primary key. Does not add the profile to the database.
	*
	* @param profileId the primary key for the new profile
	* @return the new profile
	*/
	public static com.inikah.slayer.model.Profile create(long profileId) {
		return getPersistence().create(profileId);
	}

	/**
	* Removes the profile with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profileId the primary key of the profile
	* @return the profile that was removed
	* @throws com.inikah.slayer.NoSuchProfileException if a profile with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile remove(long profileId)
		throws com.inikah.slayer.NoSuchProfileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(profileId);
	}

	public static com.inikah.slayer.model.Profile updateImpl(
		com.inikah.slayer.model.Profile profile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(profile);
	}

	/**
	* Returns the profile with the primary key or throws a {@link com.inikah.slayer.NoSuchProfileException} if it could not be found.
	*
	* @param profileId the primary key of the profile
	* @return the profile
	* @throws com.inikah.slayer.NoSuchProfileException if a profile with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile findByPrimaryKey(
		long profileId)
		throws com.inikah.slayer.NoSuchProfileException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(profileId);
	}

	/**
	* Returns the profile with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param profileId the primary key of the profile
	* @return the profile, or <code>null</code> if a profile with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.inikah.slayer.model.Profile fetchByPrimaryKey(
		long profileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(profileId);
	}

	/**
	* Returns all the profiles.
	*
	* @return the profiles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Profile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.ProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profiles
	* @param end the upper bound of the range of profiles (not inclusive)
	* @return the range of profiles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Profile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.ProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profiles
	* @param end the upper bound of the range of profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of profiles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.inikah.slayer.model.Profile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the profiles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of profiles.
	*
	* @return the number of profiles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProfilePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProfilePersistence)PortletBeanLocatorUtil.locate(com.inikah.slayer.service.ClpSerializer.getServletContextName(),
					ProfilePersistence.class.getName());

			ReferenceRegistry.registerReference(ProfileUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ProfilePersistence persistence) {
	}

	private static ProfilePersistence _persistence;
}